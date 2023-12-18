import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    List<long[]> list = new ArrayList();

	    long maxx = 0;
	    long minx = 0;
	    long maxy = 0;
	    long miny = 0;
	    long returnval = 0;
	    for (int i = 0; i < n; i++) {
		    long x = sc.nextInt();
		    long y = sc.nextInt();
	    	if (i == 0) {
	    		maxx = x;
	    		minx = x;
	    		maxy = y;
	    		miny = y;
	    	}
	    	if (x < maxx && x > minx && maxy > y && miny < y) {
	    		continue;
	    	}
	    	maxx = Math.max(x, maxx);
	    	minx = Math.min(x, minx);
	    	maxy = Math.max(y, maxy);
	    	miny = Math.min(x, miny);
		    long[] wk = {x, y};
		    if (!list.contains(wk)) {
		    	if (list.size() >= 1) {
		    		for (int j = 0; j < list.size(); j++) {
		    			long[] wk2 = list.get(j);
		    			returnval = Math.max(Math.abs(wk[0] - wk2[0]) + Math.abs(wk[1] - wk2[1]), returnval);
		    		}
		    	}
		    	list.add(wk);
		    }
	    }
	    System.out.println(returnval);
	}

}