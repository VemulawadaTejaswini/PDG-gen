public class Task3 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int cnt[] = new int[n + 1];

        long tot = 0;
        for(int i = 1;i <= n; ++i) {
            if (i != 1) {
                for (int j = i; j <= n; j += i) {
                    cnt[j]++;
                }
                tot += i * (long)(cnt[i] + 1);
            } else {
                tot++;
            }
        }
        out.println(tot);
    }
}