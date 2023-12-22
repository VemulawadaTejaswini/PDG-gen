import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            for (int i4 = 0; i4 <= N; i4++) {
                for (int i7 = 0; i7 <= N; i7++) {
                    if (i4 * 4 + i7 * 7 == N) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
            System.out.println("No");
        }
    }
}
