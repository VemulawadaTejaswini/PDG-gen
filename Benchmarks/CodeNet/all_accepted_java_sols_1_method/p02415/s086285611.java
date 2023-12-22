import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();

	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < line.length(); i++) {
	    	char c = line.charAt(i);
	    	String s = String.valueOf(c);

	    	String lowerStr = s.toLowerCase();
	    	if (lowerStr.equals(s)) {
	    		sb.append(s.toUpperCase());
	    	} else {
	    		sb.append(s.toLowerCase());
	    	}
	    }
	    System.out.println(sb.toString());
	}
}