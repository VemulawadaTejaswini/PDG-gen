import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=s.nextInt();
        int[] arr = new int[n];
      for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
      
        int[] dp = new int[n];
        
        for (int i = n - 2; i >= 0; i--) {
            int bop=Integer.MAX_VALUE;

            for(int j=1;j<=k&&i+j<n;j++){
                int cop=Math.abs(arr[i]-arr[i+j])+dp[j+i];
                bop=Math.min(bop,cop);
            }

            dp[i]=bop;

            
        }
      
        System.out.println(dp[0]);
    }
}