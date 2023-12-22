import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int ret = 64;
			
			while(ret>n) {
				ret /= 2;
			}
			
			System.out.println(ret);
			
	    }
		
	}
	
