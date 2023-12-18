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

		    String rank = "";
		    if (m == -1 || f == -1) {
		    	rank = "F";
		    	System.out.println(rank);
		    	continue;
		    }

		    m = (m == -1) ? 0 : m;
		    f = (f == -1) ? 0 : f;
		    r = (r == -1) ? 0 : r;

		    if (80 <= m + f) {
		    	rank = "A";
		    } else if (65 <= m + f && m + f < 80) {
		    	rank = "B";
		    } else if (50 <= m + f && m + f < 65) {
		    	rank = "C";
		    } else if (30 <= m + f && m + f < 50) {
		    	if (50 <= r) {
			    	rank = "C";
		    	} else {
			    	rank = "D";
		    	}
		    } else 	if (m + f < 30) {
		    	rank = "F";
		    }

		    System.out.println(rank);
	    }
	}
}