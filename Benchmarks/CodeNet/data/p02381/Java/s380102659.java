import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    StringBuilder sb = new StringBuilder();
	    int n = 0;
	    int count = 0;
	    while (true) {
    		String line = "";
    		if (count % 2 == 0) {
	    		line = br.readLine();
			    if ("0".equals(line)) break;

			    n = Integer.parseInt(line);

    		} else {
			    String[] input = br.readLine().split(" ");

		    	double total = 0d;
		    	double average = 0d;
		    	double var = 0d;
		    	double foo = 0d;
		    	double stdev = 0d;

		    	for (int i = 0; i < n; i++) {
		    		total += Double.parseDouble(input[i]);
		    	}

		    	average = total / n;

		    	for (int i = 0; i < n; i++) {
		    		var += Math.pow(Double.parseDouble(input[i]) - average, 2);
		    	}
		    	foo = var / n;

		    	stdev = Math.sqrt(var / n);

		    	sb.append(stdev).append("\n");
    		}
    		count++;
	    }
	    System.out.print(sb.toString());
	}
}