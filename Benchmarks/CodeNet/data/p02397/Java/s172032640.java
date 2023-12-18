import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[2];
		
		do {

			String str = sc.nextLine();
			String[] strs = str.split(" ");
			int x = Integer.parseInt( strs[0] );
			int y = Integer.parseInt( strs[1] );

	        if (x == 0 && y == 0) {
	        	break;
	        }else if (x < y) {
	        	System.out.println( y + " " + x );
	        }else {
	        	System.out.println( x + " " + y );
	        }
		}while(true);
		sc.close();

	}

}

