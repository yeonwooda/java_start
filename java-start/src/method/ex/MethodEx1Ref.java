package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균값: " + average(a,c,c));
//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = x + y + z;
//        average = sum / 3.0;
//        System.out.println("평균값: " + average(x, y,  z));


        // 위 문장들을 한 줄로 바꿀 수 있음

        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));
    }

    public static  double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum  / 3.0;
    }
}
