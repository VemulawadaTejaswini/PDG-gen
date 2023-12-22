import java.util.Scanner;

// B - Toll Gates
// https://atcoder.jp/contests/abc094/tasks/abc094_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int X = Integer.parseInt(scanner.next());
        boolean[] A = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            int index = Integer.parseInt(scanner.next());
            A[index] = true;
        }
        scanner.close();

        int costA = 0;
        for (int i = X; i <= N; i++) {
            if (A[i]) costA++;
        }
        int costB = 0;
        for (int i = X; i >= 0; i--) {
            if (A[i]) costB++;
        }

        System.out.println(Math.min(costA, costB));
    }
}
