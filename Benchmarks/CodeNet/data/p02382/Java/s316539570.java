import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    int n = Integer.parseInt(line);

	    String[] str_x = br.readLine().split(" ");
	    String[] str_y = br.readLine().split(" ");

	    double[] x = new double[n];
	    double[] y = new double[n];

	    double d1 = 0d;
	    double d2 = 0d;
	    double d3 = 0d;
	    double di = 0d;

	    for (int i = 0; i < n; i++) {
	    	x[i] = Double.parseDouble(str_x[i]);
	    	y[i] = Double.parseDouble(str_y[i]);
	    }

	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < n; i++) {
		    // p = 1
	    	d1 += Math.abs(x[i] - y[i]);
	    	sb.append(d1).append("\n");

	    	// p = 2
	    	d2 += Math.pow(Math.abs(x[i] - y[i]), 2);
	    	sb.append(Math.sqrt(d2)).append("\n");

	    	// p = 3
	    	d3 += Math.pow(Math.abs(x[i] - y[i]), 3);
	    	sb.append(Math.cbrt(d3)).append("\n");

	    	// p = infinity
	    	di += Math.max(Math.abs(x[i] - y[i]), Double.MIN_VALUE);
	    	sb.append(Math.cbrt(di)).append("\n");
	    }

	    System.out.print(sb.toString());
	}
}