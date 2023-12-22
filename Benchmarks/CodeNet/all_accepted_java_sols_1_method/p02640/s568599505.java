import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int x = sc.nextInt();
        final int y = sc.nextInt();

        for (int a = 0; a <= 100; a++) {
            for (int b = 0; b <= 100; b++) {
                if (a+b == x && 2*a + 4 * b == y) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
