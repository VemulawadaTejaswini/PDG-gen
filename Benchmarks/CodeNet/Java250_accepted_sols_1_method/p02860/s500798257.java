import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String S = in.next();

            if (N % 2 == 1) {
                System.out.println("No");
                return;
            }

            for (int i = 0; i < N / 2; i++) {
                if (S.charAt(i) != S.charAt(N / 2 + i)) {
                    System.out.println("No");
                    return;
                }
            }

            System.out.println("Yes");
        }
    }
}
