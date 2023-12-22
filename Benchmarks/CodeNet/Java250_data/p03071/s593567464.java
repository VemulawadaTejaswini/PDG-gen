import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = 0;

        if (a > b) {
            x += a;
            a--;
            if (a > b) {
                x += a;
            } else {
                x += b;
            }
        } else {
            x += b;
            b--;
            if (b > a) {
                x += b;
            } else {
                x += a;
            }
        }
        System.out.println(x);
    }
}