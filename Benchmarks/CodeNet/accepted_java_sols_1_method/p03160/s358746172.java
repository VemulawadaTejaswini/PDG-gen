import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n=sc.nextInt();
		int[] hight=new int[n];
      	for (int i=0;i<n;i++) {
          hight[i]=sc.nextInt();
        }
      	int[] dp=new int[n];
      	Arrays.fill(dp,Integer.MAX_VALUE);
      	dp[0]=0; 
      	for (int i=1;i<n;i++) {
        	if (i==1) dp[i]=Math.abs(hight[i]-hight[i-1]);
          	else {
              dp[i]=Math.min(dp[i-2]+Math.abs(hight[i]-hight[i-2]),dp[i-1]+Math.abs(hight[i]-hight[i-1]));
            }
        }
        System.out.println(dp[n-1]);
	}
}