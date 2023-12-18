import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        for (int i = K + 1; i <= N; i++) {
            long target = A[i-K-1];
            long current = A[i-1];
            if (target < current) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
