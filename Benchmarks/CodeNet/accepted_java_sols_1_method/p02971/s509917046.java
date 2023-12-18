import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        int[] b = new int[n];
        int max = 0;
        int sec = 0;
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
            b[i] = ary[i];
        }
        
        Arrays.sort(b);
        max = b[n-1];
        sec = b[n-2];
        for(int i = 0;i < n;i++){
            int ans = max;
            if(ary[i]==max){
                ans = sec;
            }
            System.out.println(ans);
        }
    }
}