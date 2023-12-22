import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	    while (true) {
		    String[] line = br.readLine().split(" ");

		    int m = Integer.parseInt(line[0]);
		    int f = Integer.parseInt(line[1]);
		    int r = Integer.parseInt(line[2]);

		    if (m == -1 && f == -1 && r == -1) break;

		    if (m == -1 || f == -1) {
		    	System.out.println("F");
		    } else if (80 <= m + f) {
		    	System.out.println("A");
		    } else if (65 <= m + f && m + f < 80) {
		    	System.out.println("B");
		    } else if (50 <= m + f && m + f < 65) {
		    	System.out.println("C");
		    } else if (30 <= m + f && m + f < 50) {
		    	if (50 <= r) {
			    	System.out.println("C");
		    	} else {
			    	System.out.println("D");
		    	}
		    } else 	if (m + f < 30) {
		    	System.out.println("F");
		    }
	    }
	}
}