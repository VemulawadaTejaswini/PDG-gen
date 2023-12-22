import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt() - 1;
            }

            int current = 0;
            for (int i = 1; i <= N; i++) {
                current = a[current];
                if (current == 1) {
                    System.out.println(i);
                    return;
                }
            }

            System.out.println(-1);
        }
    }
}
