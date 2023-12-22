import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String S = scanner.next();
	    int z = 0;
	    int o = 0;
	    for (int i = 0; i < S.length(); i++) {
	        if (S.charAt(i) == '0') {
	        	z++;
	        } else {
	        	o++;
	        }
	    }
	    
	    int r = Math.min(z, o) * 2;


        System.out.print(r);
	}
}