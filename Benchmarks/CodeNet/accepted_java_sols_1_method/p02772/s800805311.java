import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    ArrayList<Integer> A = new ArrayList<>();

	    for (int i = 0; i < N; i++) {
	    	int even = sc.nextInt();
	    	if (even % 2 == 0) {
	    		A.add(even);
	    	}
	    }

	    boolean flg = true;
	    for (int a : A) {
	    	if ((a % 3 !=0) && (a % 5 != 0)) {
	    		flg = false;
	    		break;
	    	}
	    }
	    
	    if (flg) {
	    	System.out.println("APPROVED");
	    } else {
		    System.out.println("DENIED");
	    }

	  }
}