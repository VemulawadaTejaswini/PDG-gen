import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
// 標準入力からデータを読み込む準備
            Scanner sc = new Scanner(System.in);
// 3つの文字の固まりをそれぞれ整数値と想定して読み込む
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a < b) {
                if (b < c) {
                    System.out.printf("%d %d %d¥n", a, b, c);
                } else if (c < b) {
                    System.out.printf("%d %d %d\n", c, a, b);
                } else {
                    System.out.printf("%d %d %d\n", a, c, b);
                }
            } else if (b < a) {
                if (c < b) {
                    System.out.printf("%d %d %d\n", c, b, a);
                } else if (a < c) {
                    System.out.printf("%d %d %d\n", b, a, c);
                } else {
                    System.out.printf("%d %d %d\n", b, c, a);
                }
            }
        }
    }

