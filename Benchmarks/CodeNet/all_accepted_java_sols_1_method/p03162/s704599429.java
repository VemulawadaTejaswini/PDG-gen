import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt (f.readLine());
        int [][]arr=new int[n][3];
        for(int i=0;i<n;i++){
            st = new StringTokenizer (f.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=Integer.parseInt(st.nextToken());
        }

        int dp[][]=new int[n][3];
        //best answer at day 3 with the last day using one two or three
        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];
        for(int i=1;i<n;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(k==j)continue;
                    dp[i][j]=Math.max(dp[i][j],arr[i][j]+dp[i-1][k]);
                }
            }
        }
            //19 17 21
        int ret=0;
        ret=Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]);
        System.out.println(ret);
        f.close();

        //print to System. out.println

    }

}
