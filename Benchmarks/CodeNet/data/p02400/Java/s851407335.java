import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = Math.PI;
        double area = pi * r * r;
        double length = 2 * r * pi;/* ここを変えて周囲の長さを求めよう */
        System.out.printf("%f %f", area, length);
        sc.close();
    }
}
