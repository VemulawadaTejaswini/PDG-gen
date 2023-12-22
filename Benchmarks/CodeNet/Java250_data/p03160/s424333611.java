
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        int arr[]=new int[n];
        int dp[]=new int[n];
        StringTokenizer st=new StringTokenizer(in.readLine()," ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);
        for(int i=2;i<n;i++)
            dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i]-arr[i-2]));
        System.out.println(dp[n-1]);
    }
}
