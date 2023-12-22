import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int resultCount = 0;
	    while (true) {
		    String[] line = br.readLine().split(" ");

		    int n = Integer.parseInt(line[0]);
		    int x = Integer.parseInt(line[1]);

		    if (n == 0 && x == 0) break;

		    for (int i = 1; i <= n; i++) {
		    	for (int j = i + 1; j <= n; j++) {
		    		for (int k = j + 1; k <= n; k++) {

		    			if (i + j + k == x) {
		    				resultCount++;
		    			}
		    		}
		    	}
		    }
		    System.out.println(resultCount);
		    resultCount = 0;
	    }
	}
}