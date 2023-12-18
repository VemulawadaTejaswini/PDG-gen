import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int WW = scan.nextInt();
	    int HH = scan.nextInt();
	    int xx = scan.nextInt();
	    int yy = scan.nextInt();
	    int rr = scan.nextInt();

		if ((WW >= xx + rr) && (HH >= yy + rr)&&(0 <= xx - rr)&&(0 <= yy - rr)) {
	    	System.out.println( "Yes" );
		}
	    else {
	    	System.out.println( "No" );
		}

	}

}