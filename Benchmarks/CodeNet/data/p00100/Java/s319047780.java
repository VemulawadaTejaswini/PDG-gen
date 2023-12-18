import java.util.*;

class Main {

    public static void main(String[] args) {
	
	Scanner stdin = new Scanner(System.in);
	final long[] sum = new long[4000];
	
	while ( true )  {
	    Arrays.fill(sum, 0);
	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }
	    for (int i = 0; i < n; i++) {
		final int cn = stdin.nextInt();
		final int su = stdin.nextInt();
		final int sn = stdin.nextInt();
		sum[cn] += su * sn;
	    }
	    boolean flag = false;
	    for (int i = 0; i < sum.length; i++){
		if (sum[i] >= 1000000) {
		    System.out.println(i);
		    flag = true;
		}
	    }
	    if (!flag) {
		System.out.println("NA");
	    }
	}	
    }
}