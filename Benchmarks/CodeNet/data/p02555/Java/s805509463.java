import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9 + 7;
    static int[] memo = new int[2020];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int s = Integer.parseInt(sc.next());
        Arrays.fill(memo, -1);
        
        int ans = calc(s);
        System.out.println(ans);
    }
    
    public static int calc(int n){
        if(n<3){
            return 0;
        }else if(n==3){
            return 1;
        }else if(memo[n] != -1){
            return memo[n];
        }
        
        int res = 1;
        for(int i=3; i<=n; i++){
            res += calc(n-i);
            res %= MOD;
        }
        
        memo[n] = res;
        return res%MOD;
    }
}