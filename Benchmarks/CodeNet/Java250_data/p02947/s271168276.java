import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        char[][] s = new char[N][];
        for (int i = 0; i < N; i++) {
            s[i] = S[i].toCharArray();
            Arrays.sort(s[i]);
        }
        for (int i = 0; i < N; i++) {
            S[i] = String.valueOf(s[i]);
        }
        Arrays.sort(S);
        long ans = 0;
        long count = 1;
        for (int i = 1; i < N; i++) {
            if (S[i].equals(S[i - 1])) {
                count++;
            } else {
                ans += count * (count - 1) / 2;
                count = 1;
            }
        }
        ans += count * (count - 1) / 2;
        count = 1;
        System.out.println(ans);
    }
}