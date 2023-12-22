import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		int N=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
		
		int dp[]=new int[N+1];
		
	if(N==2)System.out.println(Math.abs(a[0]-a[1]));
	else if(N==3&&k>=2)System.out.println(Math.min(Math.abs(a[0]-a[1])+Math.abs(a[1]-a[2]),Math.abs(a[0]-a[2])));
	else if(N==3&&k<2)System.out.println(Math.abs(a[0]-a[1])+Math.abs(a[1]-a[2]));
	
	else {
		dp[0]=0;
		dp[1]=0;
		dp[2]=Math.abs(a[0]-a[1]);
		if(k>=2)
		dp[3]=Math.min(Math.abs(a[0]-a[1])+Math.abs(a[1]-a[2]),Math.abs(a[0]-a[2]));
		else dp[3]=Math.abs(a[0]-a[1])+Math.abs(a[1]-a[2]);
		
		for(int i=4;i<N+1;i++) {
			List<Integer> list=new ArrayList<Integer>();
			
			//dp[i]=Math.min(dp[i-1]+Math.abs(a[i-2]-a[i-1]),dp[i-2]+Math.abs(a[i-3]-a[i-1]));
			for(int j=k;j>=1;j--) {if(i-j-1>=0)list.add(dp[i-j]+Math.abs(a[i-j-1]-a[i-1]));}
		dp[i]=Collections.min(list);
			
		}
		System.out.println(dp[N]);
	}}

}
