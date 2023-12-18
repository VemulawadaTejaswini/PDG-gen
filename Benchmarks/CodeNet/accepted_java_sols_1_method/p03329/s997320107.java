import java.awt.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[] = new int[1000];
        arr[0] =1;
        arr[1] = 6;
        arr[2] = 9;
        int j=2;
        for(int i=3;i<500;i++){
            arr[i] = (int)Math.pow(6,j++);
        }
        j=2;
        for(int i=500;i<1000;i++){
            arr[i] =(int) Math.pow(9,j++);
        }
        Arrays.sort(arr);
        
        int dp[] = new int[n+1];
        
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i=1;i<=n;i++){
            for(int jj=0;jj<=15;jj++){
                if(arr[jj]<=i){
                    if(dp[i-arr[jj]]!=Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i-arr[jj]]+1, dp[i]);
                    }
                }
            }
        }
        
        System.out.println(dp[n]);
        
    }
}
