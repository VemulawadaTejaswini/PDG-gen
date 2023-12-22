import java.util.*;

class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for(int i = n;i <= m;i++){
            char[] s = String.valueOf(i).toCharArray();
            if(s[0]==s[4]&&s[1] == s[3])ans++;
        }
        System.out.println(ans);
    }
}