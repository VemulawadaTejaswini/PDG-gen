import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int val[]=new int[n];
		int cost[]=new int[n];
		
		for(int i=0;i<n;i++)
			val[i]=s.nextInt();
		
		for(int i=0;i<n;i++)
			cost[i]=s.nextInt();
		
		int ans=0;
		
		for(int i=0;i<n;i++)
			ans+=Integer.max(val[i]-cost[i], 0);
		
		System.out.println(ans);
	}

}
