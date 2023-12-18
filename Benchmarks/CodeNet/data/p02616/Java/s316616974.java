import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long mod = 1000000007;
        int N = scan.nextInt();
        int K = scan.nextInt();
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scan.nextLong());
        }
        A.sort(Comparator.naturalOrder());
        if (N == K) {
            long ans = multiple(A, 0, N, mod);
            System.out.println(ans);
            return;
        }
        if (0 < A.get(0)) {
            long ans = multiple(A, N-K, N, mod);
            System.out.println(ans);
            return;
        }
        if (A.get(N-1) < 0) {
            if (K % 2 == 0) {
                long ans = multiple(A, 0, K, mod);
                System.out.println(ans);
                return;
            }
            long ans = multiple(A, N-K, N, mod);
            System.out.println(ans);
            return;
        }
        List<Long> negatives = new ArrayList<>();
        List<Long> positives = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long x = A.get(i);
            if (x == 0) {
                continue;
            }
            if (x < 0) {
                negatives.add(x);
                continue;
            }
            positives.add(x);
        }
        int negative_length = negatives.size();
        int positive_length = positives.size();
        if (negatives.size()+positives.size() < K) {
            System.out.println(0);
            return;
        }
        if (positive_length == 0) {
            if (K % 2 == 0) {
                long ans = multiple(negatives, 0, K, mod);
                System.out.println(ans);
                return;
            }
            long ans = multiple(negatives, negative_length-K, negative_length, mod);
            System.out.println(ans);
            return;
        }
        if (negative_length == 0) {
            long ans = multiple(positives, positive_length-K, positive_length, mod);
            System.out.println(ans);
            return;
        }
        long ans = 1;
        if (K % 2 == 1) {
            K -= 1;
            ans = positives.get(positive_length-1);
        }
        PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < negative_length/2; i++) {
            queue.add(negatives.get(2 * i) * negatives.get(2 * i + 1));
        }
        int start = positive_length-1;
        if (K % 2 == 1) {
            start -= 1;
        }
        while (0 < start) {
            long x1 = positives.get(start);
            long x2 = positives.get(start-1);
            queue.add(x1 * x2);
            start -= 2;
        }
        for (int i = 0; i < K / 2; i++) {
            ans *= queue.poll();
            ans %= mod;
        }
        System.out.println(ans);
    }
    private long multiple(List<Long> A, int start, int end, long mod) {
        long ans = 1;
        for (int i = start; i < end; i++) {
            ans *= A.get(i);
            if (ans < 0) {
                ans += mod;
            }
            ans %= mod;
        }
        return ans;
    }
}
