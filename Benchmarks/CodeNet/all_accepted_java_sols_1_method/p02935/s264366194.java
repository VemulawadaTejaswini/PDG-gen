import java.util.*;

class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        double ans = ary[0];
        for(int i = 1;i < n;i++){
            ans = ans + ary[i];
            ans /= 2;
        }
        System.out.println(ans);
        
    }

}