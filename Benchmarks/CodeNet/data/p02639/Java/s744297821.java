import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int[]x = new int[5];
			 x[0] = scan.nextInt();
			 x[1] = scan.nextInt();
			 x[2] = scan.nextInt();
			 x[3] = scan.nextInt();
			 x[4] = scan.nextInt();
			 
			
			
			for(int i = 0;i<5;i++) {
				if(x[i]==0) {
					System.out.println(i+1);
					System.exit(0);
				}
			}
			
		}
		
		
	}
		

}
