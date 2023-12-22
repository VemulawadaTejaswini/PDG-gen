import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s = in.readLine();
	    
	    String res = "";
	    
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c == '0') {
	            res += "0";
	        }
	        if (c == '1') {
	            res += "1";
	        }
	        if (c == 'B' && res.length() > 0) {
	            res = res.substring(0, res.length() - 1);
	        }
	    }
	    System.out.println(res);
	    
	    in.close();
	}
}