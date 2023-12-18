import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			int row = scan.nextInt();
			int col = scan.nextInt();
			
			if(row == 0 && col == 0) break;
			
			for(int j=0; j<col; j++) {
				System.out.print("#");
			}
			System.out.println();
			
			for(int i=1; i<row-1; i++) {
				for(int j=0; j<col; j++) {
					if(j==0 || j == col-1) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
						
			for(int j=0; j<col; j++) {
				System.out.print("#");
			}
			System.out.println("\n");
		}
	}
}




