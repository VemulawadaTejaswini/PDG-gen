import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    long[] H  = new long[N];

	    String r="Yes";
	    boolean flg=false;
	    H[0]=Long.parseLong(scanner.next());
	    for (int i=1; i<N; i++) {
	    	H[i]=Long.parseLong(scanner.next());
	    	if (H[i] - H[i-1] == -1) {
	    		if(flg) {
	    			r="No";
	    			break;
	    		} else {
	    			flg=true;
	    		}
	    	} else if (H[i] - H[i-1] <-1) {
	    		r="No";
    			break;
	    	} else if (H[i] - H[i-1] > 0) {
	    		flg=false;
	    	}
	    }
	    
        System.out.print(r);
	}

}