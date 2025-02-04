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
        int k = sc.nextInt();
        int[] enemy = new int[n];
        for(int i = 0;i < n;i++){
            enemy[i] = sc.nextInt();
        }
        Arrays.sort(enemy);
        long ans = 0;
        for(int i = n-1;i >= 0;i--){
            if(k > 0){
                k--;
                continue;
            }
            ans += enemy[i];
        }
        System.out.println(ans);
    }
   
}
