import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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

		int		cnt = parseNum();
		int[]	out = {-1, -1};
		int[]	tmp = null;

		for (int n = 0; n < cnt; n++) {
			tmp = parseScore();
			if (out[1] < tmp[1] || out[1] == tmp[1] && out[0] > tmp[0]) {
				out[0] = tmp[0];
				out[1] = tmp[1];
			}
		}

		System.out.printf("%d %d\n", out[0], out[1]);
	}

	private static int[] parseScore() {
		int[]	params = new int[2];
		String	strin  = null;

		if ((strin = parseStdin()) != null) {
			String[]	lines = strin.split(" ");
			params[0] = Integer.parseInt(lines[0]);
			params[1] = Integer.parseInt(lines[1]);
		}
 
		return params;
	}

	private static int parseNum() {
		int		param = 0;
		String	strin = null;

		if ((strin = parseStdin()) != null) {
			param = Integer.parseInt(strin);
		}
 
		return param;
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