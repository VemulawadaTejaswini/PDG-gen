import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int iti = n%10;
			
			if(iti==2 || iti==4 || iti==5 || iti==7 || iti==9) {
				System.out.println("hon");
			}else if(iti==0 || iti==1 || iti==6 || iti==8) {
				System.out.println("pon");
			}else {
				System.out.println("bon");
			}
			
		}
		
	}
