import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int len = S.length();
        final int Mod = 1000000000+7;
        long[] A = new long[123456];
        long[] AB = new long[123456];
        long[] dp = new long[123456];
        long base = 1L;
        for(int i=1;i<=len;i++){
            if(S.charAt(i-1)=='A'){
                AB[i] = AB[i-1];
                dp[i] = dp[i-1];
                A[i] = (A[i-1]+base)%Mod;
            }
            else if(S.charAt(i-1)=='B'){
                A[i] = A[i-1];
                dp[i] = dp[i-1];
                AB[i] = (AB[i-1] + A[i-1])%Mod;
            }
            else if(S.charAt(i-1)=='C'){
                A[i] = A[i-1];
                AB[i] = AB[i-1];
                dp[i] = (dp[i-1]+AB[i-1])%Mod;
            }
            else{ // charAt == '?'
                A[i] = ((3*A[i-1])%Mod+base)%Mod;
                AB[i] = ((3*AB[i-1])%Mod + A[i-1])%Mod;
                dp[i] = ((3*dp[i-1])%Mod+AB[i-1])%Mod;
                base = (3*base)%Mod;
            }
        }
        long ans = dp[len];
        System.out.println(ans);
    }
}
