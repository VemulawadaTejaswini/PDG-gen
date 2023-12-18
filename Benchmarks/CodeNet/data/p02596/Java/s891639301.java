import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int k = sc.nextInt();
	    int returnnum = -1;
	    if (k%2 == 0) {

	    } else {
	    	long seventemp = 7;
		    for (int i = 0; ; i++) {
		    	if (seventemp % k == 0) {
		    		returnnum = i+1;
		    		break;
		    	} else {
			    	seventemp = seventemp * 10 + 7;
		    	}
		    	System.gc();
		    }
	    }
	    System.out.println(returnnum);
	}
}
