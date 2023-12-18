import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] p = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = in.nextInt() - 1;
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (p[i] != i) {
                    count++;
                }
            }

            System.out.println(count == 0 || count == 2 ? "YES" : "NO");
        }
    }
}
