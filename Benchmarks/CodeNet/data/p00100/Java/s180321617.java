import java.util.*;

class Main {

    public static void main(String[] args) {
	
	Scanner stdin = new Scanner(System.in);
	final long[] sum = new long[4001];
	final ArrayList<Integer> exist = new ArrayList<Integer>();
	final ArrayList<Integer> noList = new ArrayList<Integer>();
	
	while ( true )  {
	    Arrays.fill(sum, 0);
	    noList.clear();
	    exist.clear();
	    
	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }
	    for (int i = 0; i < n; i++) {
		final int cn = stdin.nextInt();
		final long su = stdin.nextLong();
		final long sn = stdin.nextLong();
		if (!exist.contains(cn)) {
		    exist.add(cn);
		}
		if (sum[cn] < 1000000L) {
		    sum[cn] += su * sn;
		}
		if (sum[cn] >= 1000000L) {
		    noList.add(cn);
		}
	    }
	    
	    if (noList.isEmpty()) {
		System.out.println("NA");
	    } else {
		for ( Integer i : exist ) {
		    if ( noList.contains(i) ) {
			System.out.println(i);
		    }
		}
	    }
	}	
    }
}