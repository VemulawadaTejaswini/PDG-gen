import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt (f.readLine());
        StringTokenizer st=new StringTokenizer(f.readLine());
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt (st.nextToken());
        }

        int dp[]=new int[n];
        dp[1]=Math.abs(arr[1]-arr[0]);
        if(n>2)
            dp[2]=Math.min(Math.abs(arr[2]-arr[0]),Math.abs(arr[2]-arr[1])+dp[1]);
        for(int i=3;i<n;i++){
            dp[i]=Math.min(Math.abs(arr[i]-arr[i-1])+dp[i-1],Math.abs(arr[i]-arr[i-2])+dp[i-2]);
        }

        System.out.println(dp[n-1]);



        f.close();
    }

}
