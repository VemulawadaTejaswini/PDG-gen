import java.util.Scanner;


/**
 * Small, Large, or Equalのエントリポイントを持つメインクラスです。
 *
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            System.out.println((a == b) ? "a == b" : (a > b) ? "a > b" : "a < b");
        }
    }
}