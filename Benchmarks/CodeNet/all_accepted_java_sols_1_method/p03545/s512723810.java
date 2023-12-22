import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int A, B, C, D;
        D = x % 10;
        x = x / 10;
        C = x % 10;
        x = x / 10;
        B = x % 10;
        x = x / 10;
        A = x;

        if ((A + B + C + D) == 7) {
            System.out.println(A + "+" + B + "+" + C + "+" + D + "=7");
        } else if ((A - B + C + D) == 7) {
            System.out.println(A + "-" + B + "+" + C + "+" + D + "=7");
        } else if ((A + B - C + D) == 7) {
            System.out.println(A + "+" + B + "-" + C + "+" + D + "=7");
        } else if ((A - B - C + D) == 7) {
            System.out.println(A + "-" + B + "-" + C + "+" + D + "=7");
        } else if ((A + B + C - D) == 7) {
            System.out.println(A + "+" + B + "+" + C + "-" + D + "=7");
        } else if ((A - B + C - D) == 7) {
            System.out.println(A + "-" + B + "+" + C + "-" + D + "=7");
        } else if ((A + B - C - D) == 7) {
            System.out.println(A + "+" + B + "-" + C + "-" + D + "=7");
        } else if ((A - B - C - D) == 7) {
            System.out.println(A + "-" + B + "-" + C + "-" + D + "=7");
        }
    }
}
