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
		double[]	cheese = null;

		while((cheese = parseCheese()) != null) {
			int	cnt = parseNum();
			while (cnt-- > 0) {
				double	size = (double)parseNum();
				if (size > cheese[0] || size > cheese[1] || size > cheese[2]) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}
		}
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static double[] parseCheese() {
		String		str    = null;
		double[]	cheese = null;
		int[]		tmp    = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");

			if (lines.length == 3) {
				if (!lines[0].equals("0") || !lines[1].equals("0") || !lines[2].equals("0")) {
					tmp       = new int[3];
					tmp[0]    = Integer.parseInt(lines[0]);
					tmp[1]    = Integer.parseInt(lines[1]);
					tmp[2]    = Integer.parseInt(lines[2]);
					cheese    = new double[3];
					cheese[0] = Math.sqrt((double)(tmp[0]*tmp[0] + tmp[1]*tmp[1])) / 2.0;
					cheese[1] = Math.sqrt((double)(tmp[1]*tmp[1] + tmp[2]*tmp[2])) / 2.0;
					cheese[2] = Math.sqrt((double)(tmp[2]*tmp[2] + tmp[0]*tmp[0])) / 2.0;
				}
			}
		}
 
		return cheese;
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