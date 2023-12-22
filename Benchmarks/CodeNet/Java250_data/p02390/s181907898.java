import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		
	    Scanner sc = new Scanner(System.in);
	    String  t = sc.next();
	    int S = Integer.parseInt(t);
	    if( 0 <= S && S < 86400){
	        int h = S / 60 / 60;
            int m = ( S - (h * 60 * 60) ) / 60;
            int s = ( S - (h * 60 * 60 + m * 60));
	        System.out.println( h + ":" + m + ":" + s );
    	}
	}

}