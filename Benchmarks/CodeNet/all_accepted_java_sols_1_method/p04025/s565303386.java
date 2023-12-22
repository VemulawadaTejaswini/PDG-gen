import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			int ret = Integer.MAX_VALUE;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i=-100;i<=100;i++) {
				int cost = 0;
				for(int j=0;j<n;j++) {
					cost += (a[j]-i)*(a[j]-i);
				}
				
				ret = Math.min(ret, cost);
			}
			
			System.out.println(ret);
	    }
		
	}
	
