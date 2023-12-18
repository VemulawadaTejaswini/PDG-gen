import java.util.*;
public class Main {
  	static int mod = 1000000007;
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int N = s.nextInt();
      	double[] dp = new double[N+1];
      	dp[0] = 1;
      	for(int i=1;i<=N;i++){
        	double p_head = s.nextDouble();
          	for(int j=i;j>=0;j--){
            	dp[j] = ((j==0)?0:((p_head)*dp[j-1])) + (1-p_head)*dp[j];
            }
        }
      	double ans = 0;
      	for(int i=0;i<=N;i++){
        	int t = N-i;
          	if(t<i){
            	ans+=dp[i];
              	//System.out.println(i+" "+dp[i]);
            }
        }
      	System.out.println(ans);
    }
}