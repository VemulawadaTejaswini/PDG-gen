import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long m = sc.nextLong();
			long ret = 0;
			
			
			if(m>=2*n) {
				ret += (n+(m-2*n)/4);
			}else {
				ret += m/2;
			}
			
			System.out.println(ret);
		}
		
		
	}
