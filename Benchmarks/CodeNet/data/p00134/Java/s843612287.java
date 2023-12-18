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
		int	cnt;

		while ((cnt = parseCnt()) != -1) {
			int	avr = 0;

			for (int i = 0; i < cnt; i++) {
				avr += parseCnt();
			}
			avr = (cnt > 1) ? avr / cnt : avr;

			System.out.println(avr);
		}
	}
 
	private static int parseCnt() {
		int     cnt = -1;
		String  str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
	}
 
	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) stdin = tmp;
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}