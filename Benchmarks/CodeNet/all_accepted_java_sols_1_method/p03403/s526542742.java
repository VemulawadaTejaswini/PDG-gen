import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			long[] a = new long[n+2];
			long[] b = new long[n+2];
			
			
			for(int i=1;i<=n;i++) {
				a[i] = sc.nextInt();
			}
			
			a[0]=0;
			a[n+1]=0;
			
			b[0] = 0;
			
			long sum = 0;
			
			for(int i=1;i<=n+1;i++) {
				b[i] = Math.abs(a[i]-a[i-1]);
				sum += b[i];
			}
			
			
			for(int i=1;i<=n;i++) {
				long sum2 = sum-b[i]-b[i+1]+Math.abs(a[i+1]-a[i-1]);
				
				System.out.println(sum2);
				
				
			}
	       
		}
		
	}
