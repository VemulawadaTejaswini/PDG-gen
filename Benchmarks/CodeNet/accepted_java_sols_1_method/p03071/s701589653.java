import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int coins = 0;

        for (int i = 0; i < 2; i++) {
            coins += Math.max(A, B);
            if (A > B) {
                A--;
            } else {
                B--;
            }
        }
        System.out.print(coins);
    }
}