import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			int row = scan.nextInt();
			int col = scan.nextInt();
			
			if(row == 0 && col == 0) break;
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}




