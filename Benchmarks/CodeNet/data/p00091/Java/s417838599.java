import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br     = null;
	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int	cnt = 0;

		while ((cnt = parsePoint()) != 0) {
		}
	}
 
	private static int parsePoint() {
		int		params = 0;
        String	strin  = null;

        if ((strin = parseStdin()) != null) {
        	params = Integer.parseInt(strin);
        }
 
        return params;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (!tmp.isEmpty()) stdin = tmp;
        }
        catch (IOException e) {}
 
        return stdin;
	}
}