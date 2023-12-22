import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int[] x = new int[n];
			int min = 100;
			int max = 0;
			
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
				min = Math.min(min, x[i]);
				max = Math.max(max, x[i]);
			}
			
			int ret = Integer.MAX_VALUE;
			int reti = 0;
			
			for(int i=min;i<=max;i++) {
				reti = 0;
				for(int j=0;j<n;j++) {
					reti += Math.pow((x[j]-i), 2);
				}
				
				ret = Math.min(ret, reti);
			}
			
			System.out.println(ret);
		}
	}
