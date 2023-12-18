import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // 3つの文字の固まりをそれぞれ整数値と想定して読み込む
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.printf("%d %d %d\n", a, b, c);
            } else if (a < c) {
                if (c < b) {
                    System.out.printf("%d %d %d\n", a, c, b);
                }
            }
        }
        if (b < a) {
            if (a < c) {
                System.out.printf("%d %d %d\n", b, a, c);
            } else if (b < c) {
                if (c < a) {
                    System.out.printf("%d %d %d\n", b, c, a);
                }
            }
        }
        if (c < a) {
            if (a < b) {
                System.out.printf("%d %d %d\n", c, a, b);
            } else if (c < b) {
                if (b < a) {
                    System.out.printf("%d %d %d\n", c, b, a);
                }
            }
        }
    }
}
