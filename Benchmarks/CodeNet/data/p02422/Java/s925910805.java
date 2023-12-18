import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String str = br.readLine();
	    StringBuilder sb = new StringBuilder(str);

	    int q = Integer.parseInt(br.readLine());

	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < q; i++) {
	    	String[] line = br.readLine().split(" ");

	    	String order = line[0];
	    	int a = Integer.parseInt(line[1]);
	    	int b = Integer.parseInt(line[2]) + 1;

	    	String p = "";
	    	if (line.length > 3) p = line[3];

	    	if ("replace".equals(order)) {
	    		sb.replace(a, b, p).toString();
	    	}

	    	if ("reverse".equals(order)) {
	    		StringBuilder temp = new StringBuilder(sb.substring(a, b));
	    		sb.replace(a, b, temp.reverse().toString()).toString();
	    	}

	    	if ("print".equals(order)) {
		    	result.append(sb.substring(a, b)).append("\n");
	    	}
 	    }
	    System.out.print(result.toString());
	}
}