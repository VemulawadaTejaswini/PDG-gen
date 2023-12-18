import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] ary = new int[n];
        int[] sum = new int[n];
        ary[0] = sc.nextInt();
        sum[0] = ary[0];
        for(int i = 1;i < n;i++){
            ary[i] = sc.nextInt();
            sum[i] = sum[i-1] + ary[i];
        }
        int poyo = 0;
        int ans = MAX;
        for(int i = 0;i < n;i++){
            if(sum[i] < s)continue;
            for(int j = poyo;j < n;j++){
                poyo = j;
                if(ans > i-j)ans = i-j;
                if(sum[i]-sum[j]<s)break;
            }
        }
        if(ans==MAX)ans=-1;
        System.out.println(ans+1);
    }    
}




