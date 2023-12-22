import java.util.*;
import java.io.*;
 
class Main{
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	String[] str = br.readLine().split(" ");
  	int n = Integer.parseInt(str[0]);
  	int k = Integer.parseInt(str[1]);
  	int[] h = new int[n];
  	String[] s = br.readLine().split(" ");
  	for(int i=0;i<n;i++)
      h[i] = Integer.parseInt(s[i]);
  	int[] dp = new int[n];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0] = 0;
  	//dp[1] = Math.abs(h[1]-h[0]);
  	for(int i=1;i<n;i++){
      for(int j=i-1;j>=0 && i-j<=k;j--)
      dp[i] = Math.min(dp[i],dp[j] + Math.abs(h[i]-h[j]));
    }
      System.out.println(dp[n-1]);
    }
}
