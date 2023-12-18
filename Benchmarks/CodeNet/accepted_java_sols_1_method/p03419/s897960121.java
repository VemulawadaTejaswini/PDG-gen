import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			long n = sc.nextLong();
			long m = sc.nextLong();
			long ret = 0;
			
			if(n>=2&&m>=2) {
				ret = (n-2)*(m-2);
			}
			if(n==1||m==1) {
				ret = n*m-2;
			}
			
			if(n==1&&m==1) {
				ret = 1;
			}
			
			System.out.println(ret);
			
		}



	}
