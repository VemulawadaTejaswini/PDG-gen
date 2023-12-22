import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] H = new int[N];

	    
	    for (int i=0; i<N; i++) {
	    	H[i] = Integer.parseInt(scanner.next());
	    }

	    int c=0;
	    while(true) {
	    	boolean flg= false;
	    	for (int i=0; i<N; i++) {
		    	if (H[i] != 0) {
		    		H[i]--;
		    		flg=true;
		    	} else if(flg) {
		    		break;
		    	}
		    }
	    	if (!flg) {
	    		break;
	    	}
	    	c++;
	    }

	    System.out.println(c);
	}
}