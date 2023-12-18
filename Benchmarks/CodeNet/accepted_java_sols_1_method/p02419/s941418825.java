import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	final static String EOF_STR = "END_OF_TEXT";
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String findStr = br.readLine().toLowerCase();

	    int findCount = 0;
	    while (true) {
	    	String line = br.readLine();
	    	if (EOF_STR.equals(line)) break;

	    	line = line.toLowerCase();
	    	String[] words = line.split(" ");
	    	for (int i = 0; i < words.length; i++) {
	    		if (findStr.equals(words[i])) {
	    			findCount++;
	    		}
	    	}
	    }
        System.out.println(findCount);
	}
}