import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String S = scanner.next();
	    long K = Long.parseLong(scanner.next());

	    int index = 0;
	    char cr= '1';
	    for (int i=0; i<S.length(); i++) {
	        char c = S.charAt(i);
	        if(c == '1') {
	        	c++;
	        } else {
	        	cr=c;
	        	index=i;
	        	break;
	        }
	    }

        if(K-1 >= index) {
        	System.out.print(cr);
        } else {
        	System.out.print('1');
        }

	}

}