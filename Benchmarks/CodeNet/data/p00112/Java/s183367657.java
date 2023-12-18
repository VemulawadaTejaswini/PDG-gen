import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[]	wait = null;

		while ((wait = parseWait()) != null) {
			long	out = 0;

			for (int l = 0; l < wait.length; l++) {
				out += wait[l] * ((long)(wait.length) - 1L - (long)(l));
			}

			System.out.println(out);
		}
	}

	private static long[] parseWait() {
		int		num  = 0;
		long[]	wait = null;

		if ((num = parseNum()) != 0) {
			wait = new long[num]; 
			for (int l = 0; l < num; l++) {
				wait[l] = (long)(parseNum());
			}
			Arrays.sort(wait);
		}

		return wait;
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}