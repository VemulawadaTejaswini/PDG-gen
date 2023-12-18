import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        boolean[] ans = new boolean[N];
        Arrays.fill(ans, true);
        for (int i = 0; i < N; i++) {
            if (ans[i] == false) {
                continue;
            }
            for (int j = i + 1; j < N; j++) {
                if (A[j] % A[i] == 0) {
                    ans[j] = false;
                }
            }
        }
        for (int i = 1; i < N; i++) {
            if (!ans[i-1]) {
                continue;
            }
            if (ans[i]) {
                continue;
            }
            if (A[i-1] == A[i]) {
                ans[i-1] = false;
            }
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (ans[i]) {
                a += 1;
            }
        }
        System.out.println(a);
    }
}
