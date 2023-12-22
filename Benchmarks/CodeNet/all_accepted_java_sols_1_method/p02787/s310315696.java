import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int MOD = 1000000007;

    public static void main(String[] args) {

        //int ans=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int ans =0;
        int h =sc.nextInt();
        int n=sc.nextInt();
        int[] a = new int[n],b=new int[n];
        int[][] dp = new int[n][h+1];


        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        for(int i=1;i<h+1;i++){
            if(i%a[0]==0)dp[0][i]=(i/a[0])*b[0];
            else dp[0][i]=(i/a[0]+1)*b[0];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<h+1;j++){
                if(j<=a[i]){
                    dp[i][j]=Math.min(b[i],dp[i-1][j]);
                }else{

                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-a[i]]+b[i]);
                }
            }
        }


        System.out.println(dp[n-1][h]);

    }


}


