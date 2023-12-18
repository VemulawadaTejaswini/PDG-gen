import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int[] maxFromLelt = new int[N];
            for (int i = 0; i < N; i++) {
                maxFromLelt[i] = Math.max(i - 1 >= 0 ? maxFromLelt[i - 1] : 0, A[i]);
            }
            int[] maxFromRight = new int[N];
            for (int i = N - 1; i >= 0; i--) {
                maxFromRight[i] = Math.max(i + 1 < N ? maxFromRight[i + 1] : 0, A[i]);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(Math.max(i - 1 >= 0 ? maxFromLelt[i - 1] : 0, i + 1 < N ? maxFromRight[i + 1] : 0));
            }
            System.out.println(sb.toString());
        }
    }
}
