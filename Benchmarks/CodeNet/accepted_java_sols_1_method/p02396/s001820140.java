import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);

		do {


	        int x = sc.nextInt();

	        if (x == 0) {
	        	break;
	        }else {
	        	System.out.println( "Case "+ (i + 1) +": "+ x);
	        }

	        i++;

		}while(true);
		sc.close();
	}
}
