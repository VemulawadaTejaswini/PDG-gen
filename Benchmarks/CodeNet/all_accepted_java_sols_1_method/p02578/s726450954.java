import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			long max = 0;
			long ret = 0;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
				max = Math.max(max, a[i]);
				if(max>a[i]) {
					ret += (max-a[i]);
				}
			}
			System.out.println(ret);
			
			
	    }
				
	}
	
