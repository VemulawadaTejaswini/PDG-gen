import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean turnT = true;
        while (0 < A && 0 < C) {
            if (turnT) {
                C -= B;
            } else {
                A -= D;
            }
            turnT = !turnT;
        }
        System.out.println(A < 1 ? "No" : "Yes");
    }
}