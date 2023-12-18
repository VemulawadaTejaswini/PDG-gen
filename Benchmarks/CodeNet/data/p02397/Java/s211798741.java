import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {

			String str = sc.nextLine();
			String[] strs = str.split(" ");
			int x = Integer.parseInt( strs[0] );
			int y = Integer.parseInt( strs[1] );
			int tmp = 0;

	        if (x == 0 && y == 0) {
	        	break;
	        }else  {

	        	if (x < y) {
	        		tmp = x;
	        		x = y;
	        		y = tmp;
	        	}

	        	System.out.println( x + " " + y );
	        }
		}while(true);
		sc.close();

	}

}

