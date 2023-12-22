import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        while (true) {
            if (C - B <= 0) {
                System.out.println("Yes");
                return;
            } else {
                C -= B;
            }
            if (A - D <= 0) {
                System.out.println("No");
                return;
            } else {
                A -= D;
            }
        }
    }
}