import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
	for(int k=1; ;k++){
	    int W = sc.nextInt();
	    if(W==0) break;
	    
	    int[] dp = new int[W+1];
	    for(int i=0; i<=W; i++){
		dp[i]=0;
	    }
	    
	    int n = sc.nextInt();
	    int dv,dw;
	    for(int i=0; i<n; i++){
		String[] s = sc.next().split(",");
		dv = Integer.parseInt(s[0]); //value
		dw = Integer.parseInt(s[1]); //weight
		for(int j=W; j>=0; j--){
		    if(j+dw <= W) dp[j+dw] = Math.max(dp[j+dw], dv+dp[j]);
		}
	    }
	  
	    
	    int[] max = new int[2];
	    max[0] = -1; //[0]dv [1]i
	    for(int i=W; i>=0; i--){
		if(max[0] <= dp[i]){
		    max[0] = dp[i];
		    max[1] = i;
		}
	    }
	    System.out.println("Case " + k + ":\n" + max[0] +"\n" + max[1]);
	}
    }
}