import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    ArrayList<Integer> result = new ArrayList<Integer>();
	    while (true) {
		    String line = br.readLine();

		    if ("0".equals(line)) break;

		    int sum = 0;
		    for (int i = 0; i < line.length(); i++) {
		    	char c = line.charAt(i);
		    	String s = String.valueOf(c);
		    	sum += Integer.parseInt(s);
		    }
		    result.add(sum);
	    }

	    // Display Anaser
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < result.size(); i++) {
	    	sb.append(result.get(i));
    		sb.append("\n");
	    }
	    System.out.print(sb.toString());
	}
}