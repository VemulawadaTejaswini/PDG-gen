import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			String x = sc.next();
			char y = x.charAt(0);
			
			if(Character.isUpperCase(y)) {
				System.out.println("A");
			}else {
				System.out.println("a");
			}
			
		}
	}
