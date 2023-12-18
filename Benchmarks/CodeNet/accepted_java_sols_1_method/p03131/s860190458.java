import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			long k = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long x = (k+1)/(a+2);
			long rem = k-2*x-a*x+1;
			
			long ret = 0;
			long i = (k-a-1)/2;
			
			if(k==a) {
				System.out.println(k+1);
			}else if(b-a>1) {
				ret = (i+1)*b-i*a+((k-a-1)%2);
				System.out.println(ret);
			}else {
				System.out.println(k+1);
			}
			
		}
		
		
		
	}
