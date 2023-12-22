import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String str = scan.next();
	        scan.close();

	        String strAfter = null;
			for(int i=0; i<str.length() ;i++) {
				 str.charAt(i);
				 strAfter += "x";
			}
          	System.out.print(strAfter.replace("null", ""));

    }
}
