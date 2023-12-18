    import java.util.Arrays;
    import java.util.Scanner;
     
    public class Main {
     
    static Scanner sc = new Scanner(System.in);
    static int N, M;
    static Prof[] p;
     
    static void solve() {
    final int INF = 1 << 30;
    int[] dp = new int[N + 1];
    Arrays.fill(dp, INF);
    dp[0] = 0;
    Arrays.sort(p);
    for (int i = 0; i < M; ++i) {
    if (dp[p[i].a - 1] == INF) {
    System.out.println("Impossible");
    return;
    }
    int count = INF;
    for (int j = p[i].a - 1; j <= p[i].b; ++j) {
    count = Math.min(dp[j], count);
    }
    for (int j = p[i].a; j <= p[i].b; ++j) {
    dp[j] = Math.min(dp[j], count + 1);
    }
    }
    System.out.println(dp[N] == INF ? "Impossible" : dp[N]);
    }
     
    static class Prof implements Comparable<Prof> {
    int a, b;
     
    Prof(int a, int b) {
    this.a = a;
    this.b = b;
    }
     
    public int compareTo(Prof o) {
    return this.a - o.a;
    }
    }
     
    public static void main(String[] args) {
    N = sc.nextInt();
    M = sc.nextInt();
    p = new Prof[M];
    for (int i = 0; i < M; ++i) {
    int a = sc.nextInt();
    int b = sc.nextInt();
    p[i] = new Prof(a, b);
    }
    solve();
    }
    }