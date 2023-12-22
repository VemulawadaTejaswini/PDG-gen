import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int h[] = new int[n+1];
		for(int i=1;i<=n;i++) {
			h[i] = scan.nextInt();
		}
		
		int cost[] = new int[n+1];
		cost[1] = 0;
		
		for(int i=2;i<=n;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=1;j<=k;j++) {
				if(i - j <=0) {
					break;
				}
				
				min = Math.min(min, Math.abs(h[i]-h[i-j]) + cost[i-j]);
				
			}
			
			cost[i] = min;
			
		}
		
		System.out.println(cost[n]);
	}
}
