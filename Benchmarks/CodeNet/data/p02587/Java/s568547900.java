import java.util.*;

public class Main {
    private static int n;
    private static String[] s;
    private static long[] c;
    private static long[][][][] dp;

    private static boolean judge(String st) {
        int i = 0, j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    private static long dfs(int i, int l, int r, int k, Set<String> S) {
        if (l > r) return 0L;
        String st = s[i].substring(l, r + 1);
        if (S.contains(st)) return Long.MAX_VALUE;
        if (dp[i][l][r][k] != -1) return dp[i][l][r][k];
        if (judge(st)) return dp[i][l][r][k] = 0L;
        S.add(st);
        long ans = Long.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int lenj = s[j].length();
            if (k == 0) {
                int ii = 0;
                while (ii < st.length() && ii < lenj) {
                    char chi = st.charAt(ii);
                    char chj = s[j].charAt(lenj - 1 - ii);
                    if (chi != chj) break;
                    ii++;
                }
                if (ii != st.length() && ii != lenj) continue;
                if (ii == st.length()) {
                    long tem = dfs(j, 0, lenj - 1 - ii, 1, S);
                    if (tem != Long.MAX_VALUE) ans = Math.min(ans, c[j] + tem);
                } else {
                    long tem = dfs(i, l + ii, r, 0, S);
                    if (tem != Long.MAX_VALUE) ans = Math.min(ans, c[j] + tem);
                }
            } else {
                int ii = 0;
                while (ii < lenj && ii < st.length()) {
                    char chi = st.charAt(st.length() - 1 - ii);
                    char chj = s[j].charAt(ii);
                    if (chi != chj) break;
                    ii++;
                }
                if (ii != st.length() && ii != lenj) continue;
                if (ii == st.length()) {
                    long tem = dfs(j, ii, lenj - 1, 0, S);
                    if (tem != Long.MAX_VALUE) ans = Math.min(ans, c[j] + tem);
                } else {
                    long tem = dfs(i, l, r - ii, 1, S);
                    if (tem != Long.MAX_VALUE) ans = Math.min(ans, c[j] + tem);
                }
            }
        }
        S.remove(st);
        return dp[i][l][r][k] = ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        s = new String[n];
        c = new long[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
            c[i] = scan.nextLong();
        }
        dp = new long[n][20][20][2];
        for (int i = 0; i < n; i++) {
            for (int l = 0; l < s[i].length(); l++) {
                for (int r = l; r < s[i].length(); r++) {
                    dp[i][l][r][0] = dp[i][l][r][1] = -1;
                }
            }
        }
        long ans = Long.MAX_VALUE;
        Set<String> S = new HashSet();
        for (int i = 0; i < n; i++) {
            long tem = dfs(i, 0, s[i].length() - 1, 0, S);
            if (tem != Long.MAX_VALUE) ans = Math.min(ans, c[i] + tem);
        }
        System.out.println(ans == Long.MAX_VALUE ? -1 : ans);
    }
}
