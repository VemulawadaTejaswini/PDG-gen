import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    List<int[]> list = new ArrayList();

	    boolean check = true;
	    long returnval = 0;
	    for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int[] wk = {x, y};
		    if (!list.contains(wk)) {
		    	if (list.size() > 1) {
		    		for (int j = 0; j < list.size(); j++) {
		    			int[] wk2 = list.get(j);
		    			returnval = Math.max(Math.abs(wk[0] - wk2[0]) + Math.abs(wk[1] - wk2[1]), returnval);
		    		}
		    	}
		    	list.add(wk);
		    }
	    }
	    System.out.println(returnval);
	}
}