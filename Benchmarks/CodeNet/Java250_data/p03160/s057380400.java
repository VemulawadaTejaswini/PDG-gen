
import java.util.*;
import java.io.*;


class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
		String[] s=br.readLine().split(" ");
		int[] a=new int[n];
		int i=0;
		for(String s1:s) {
			a[i]=Integer.parseInt(s[i].trim());
			i++;
		}
		System.out.println(algo(a,n));
		
		
		

	}
	
	public static int algo(int[] a,int n) {
		int[] dp=new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
//		dp[0]=0;
		dp[0]=0;
		for(int i=1;i<n;i++) {
			if(i-1>=0) {
				int x=dp[i-1]+Math.abs(a[i]-a[i-1]);
				dp[i]=Math.min(dp[i],x);
			}
			if(i-2>=0) {
				int x=dp[i-2]+Math.abs(a[i]-a[i-2]);
				dp[i]=Math.min(dp[i],x);
			}
			
		}
		return dp[n-1];
		
	}
	
	
	
	

}
