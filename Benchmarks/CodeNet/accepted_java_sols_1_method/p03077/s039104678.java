import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			long e = sc.nextLong();
			
			long[] x = new long[6];
			
			x[0] = n;
			
			for(int i=1;i<6;i++) {
				x[i] = 0L;
			}
			
			long ret = 0L;
			
			ret = Math.min(e, Math.min(d, Math.min(c, Math.min(b, a))));
			
			
			System.out.println((n+ret-1)/ret+4);
			
		}
		
	}
	
