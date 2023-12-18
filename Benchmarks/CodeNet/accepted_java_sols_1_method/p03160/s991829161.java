import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;++i) {
			h[i]=sc.nextInt();
		}
		long cost[]=new long[n];
		cost[0]=0;
		cost[1]=Math.abs(h[1]-h[0]);
		
		for(int i=2;i<n;++i) {
			cost[i]=Math.min(cost[i-2]+Math.abs(h[i-2]-h[i]),cost[i-1]+Math.abs(h[i-1]-h[i]));
		}
		
		System.out.println(cost[n-1]);
	}
}
