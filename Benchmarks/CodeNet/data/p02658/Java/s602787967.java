import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			long a ;
			long ret = 1;
			long x = 1000000000000000000L;
			
			for(int i=0;i<n;i++) {
				a = sc.nextLong();
				ret *= a;
				
			}
			if(ret>x) {
				System.out.println(-1);
				return;
			}
			System.out.println(ret);
		}
		
	}
