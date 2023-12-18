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
		int cnt = parseCnt();

		while (cnt-- > 0) {
			double	diff = parseDiffAngle();
			if (diff < 30.0 || 330.0 < diff) {
				System.out.println("alert");
			} else if (90.0 <= diff && diff <= 270.0) {
				System.out.println("safe");
			} else {
				System.out.println("warning");
			}
		}
	}
 
	private static double parseDiffAngle() {
		double	diff = 0;
		double	tmp1 = 0;
		double	tmp2 = 0;
		String  time = null;

		if ((time = parseStdin()) != null) {
			String[]  lines = time.split(":");
			tmp1 = Double.parseDouble(lines[1]) / 30.0;
			tmp2 = (Double.parseDouble(lines[0]) * 60.0 + Double.parseDouble(lines[1])) / 360.0;
			diff = (tmp1 > tmp2) ? tmp1 - tmp2 : tmp2 - tmp1;
		}

		return diff * 180.0;
	}
 
	private static int parseCnt() {
		int     cnt = 0;
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