import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = "";
	    HashMap<String, Integer> ans = new HashMap<String, Integer>();
	    while ((line = br.readLine()) != null) {
		    for (int i = 0; i < line.length(); i++) {
		    	String str = Character.toString(line.charAt(i)).toLowerCase();

		    	if (ans.containsKey(str)) {
		    		ans.put(str, ans.get(str) + 1);
		    	} else {
		    		ans.put(str, 1);
		    	}
		    }
	    }

	    // Display Answer
	    StringBuilder sb = new StringBuilder();
	    for (char c = 'a'; c <= 'z'; c++) {
	    	sb.append(c).append(" : ");
	    	String keyChar = Character.toString(c);
	    	if (ans.containsKey(keyChar)) {
	    		sb.append(ans.get(keyChar));
	    	} else {
	    		sb.append("0");
	    	}

    		sb.append("\n");
 	    }
	    System.out.print(sb.toString());
	}
}