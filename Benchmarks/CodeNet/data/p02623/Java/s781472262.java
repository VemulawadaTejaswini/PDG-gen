import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        long[] A = new long[N];
        long[] B = new long[M];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] = scan.nextInt();
        }
        long[] sumA = new long[N+1];
        long[] sumB = new long[M+1];
        for (int i = 0; i < N; i++) {
            sumA[i+1] = sumA[i] + A[i];
        }
        for (int i = 0; i < M; i++) {
            sumB[i+1] = sumB[i] + B[i];
        }
        TreeMap<Long, Integer> sb = new TreeMap<>();
        for (int i = 0; i <= M; i++) {
            sb.put(sumB[i], i);
        }
        long ans = 0;
        for (int i = 0; i <= N; i++) {
            long sum = sumA[i];
            long remain = K - sum;
            if (remain < 0) {
                continue;
            }
            long key = sb.floorKey(remain);
            long t = i + sb.get(key);
            ans = Math.max(ans, t);
        }
        System.out.println(ans);
    }
}
