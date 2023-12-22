import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        while (true) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                return;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                return;
            }

        }

    }
}