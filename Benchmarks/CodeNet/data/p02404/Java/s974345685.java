import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			if(H == 0 && W == 0)break;
			
			for(int i = 1;i <= W;i++) {
				System.out.print("#");
				
			}
			
			System.out.println("");
			
			for(int j = 1;j <= H - 2;j++) {
				System.out.print("#");
					for(int k = 1;k <= W - 2;k++) {
						System.out.print(".");
						
					}
				System.out.println("#");
				
			}
			
			for(int i = 1;i <= W;i++) {
				System.out.print("#");
				
			}

			System.out.println("");
			
			System.out.println("");
			
		}
				
	}
}
