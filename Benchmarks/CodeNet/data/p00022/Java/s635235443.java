import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] cost = new int[n];
			int m = 0;
			
			cost[0] = sc.nextInt();
			for(int i=1;i<n;i++){
				m = sc.nextInt();
				if(cost[i-1]+m>m) cost[i]=cost[i-1]+m;
				else cost[i]=m;
			}
			Arrays.sort(cost);
			System.out.println(cost[n-1]);
		}
	}	
}