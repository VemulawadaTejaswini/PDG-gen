import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int mx = 0;
        for(int i=0;i<n;i++){ a[i] = sc.nextInt(); mx = Math.max(mx,a[i]);}
        int[] dp = new int[mx+1];
        for(int i=0;i<n;i++){
            dp[a[i]]++;
        }
        long ans = 0;
        for(int i=1;i<=mx;i++){
            long x = dp[i];
            x *= (x-1);
            x/=2;
            ans +=x;
        }
        for(int i=0;i<n;i++){
            int y = dp[a[i]];
            System.out.println(ans-y+1);
        }
     }
}