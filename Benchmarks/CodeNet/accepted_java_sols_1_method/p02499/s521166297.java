import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
	try {
	    BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	    String line = null;
	    String st = "";
	    int[] counter = new int[26];
	    for (int i = 0; i < 26; i++) {
		counter[i] = 0;
	    }

	    while ((line = stdReader.readLine()) != null) {
		st += line;
	    }
	    char[] in = st.toCharArray();
	    for (int i = 0; i < st.length(); i++) {
		int t = Character.toLowerCase(in[i]) - 'a';
		if (0 <= t && t <= 26) {
		    counter[t]++;
		}
	    }
	    for (int i = 0; i < 26; i++) {
	    	System.out.println((char)(0x61 + i) + " : " + counter[i]);
	    }
	} catch (Exception e) {
	    System.out.println(e);
	    e.getStackTrace();
	    System.exit(-1);
	}
    }
}