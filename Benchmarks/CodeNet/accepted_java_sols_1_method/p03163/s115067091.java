import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int []weight=new int[n];
        int []value=new int[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(f.readLine());
            weight[i]=Integer.parseInt(st.nextToken());
            value[i]=Integer.parseInt(st.nextToken());
        }

        long[][]dp=new long[n+1][k+1];
//        for(int i=0;i<n;i++){
//            dp[0][i]=
//        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<k+1;j++){
                dp[i][j]=dp[i-1][j];
                if(j-weight[i-1]>=0)
                dp[i][j]=Math.max(dp[i-1][j-weight[i-1]]+(long)value[i-1],dp[i][j]);
            }
        }
//        for(int i=0;i<n+1;i++){
//            System.out.println();
//            for(int j=0;j<k+1;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//        }
        System.out.println(dp[n][k]);
        f.close();

        //print to System. out.println

    }

}
