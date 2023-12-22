import java.util.*;
import java.io.*;

public class Main {
    static final int MOD=1000000007;
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(f.readLine());
        int n = Integer.parseInt (st.nextToken());
        int m = Integer.parseInt (st.nextToken());
        char[][] arr=new char[n][m];

        for(int i=0;i<n;i++){
            arr[i]=f.readLine().toCharArray();
        }
        long dp[][]=new long[n][m];
        dp[0][0]=1;
        for(int i=1;i<n;i++){
            if(arr[i][0]=='#'){
                break;
            }
            dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            if(arr[0][i]=='#'){
                break;
            }
            dp[0][i]=1;
        }
        for(int i=1;i<n;i++){
            p:
            for(int j=1;j<m;j++){
                if(arr[i][j]=='#')continue p;
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                dp[i][j]%=MOD;

            }
        }
//        for(int i=0;i<n;i++){
//            System.out.println();
//            for(int j=0;j<m;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//        }
        System.out.println(dp[n-1][m-1]);
        f.close();

        //print to System. out.println

    }

}
