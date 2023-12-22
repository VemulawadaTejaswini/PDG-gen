import java.util.*;

class Main {
    // ABC152D
    static final long MOD = 1_000_000_007;
    // 10^9+7
    static final int MAX = 2_147_483_646;
    // intの最大値
    static final int INF = 1_000_000_000;

    // 10^9
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        boolean[] red = new boolean[n];
        for(int i = 0;i < n;i++){
            ary[i] = 1;
            red[i] = false;
        }
        red[0] = true;
        int m = sc.nextInt();
        for(int i = 0;i < m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            ary[x-1]--;
            ary[y-1]++;
            if(red[x-1])red[y-1] = true;
            if(ary[x-1]<=0)red[x-1] = false;
        }
        int ans = 0;
        for(int i = 0;i < n;i++){
            if(ary[i]>0&&red[i])ans++;
        }
        System.out.println(ans);
    }
}
