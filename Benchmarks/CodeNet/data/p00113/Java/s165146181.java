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
		int[]	data = null;

		while ((data = parseData()) != null) {
			int		p   = data[0] / data[1];
			int		q   = data[0] % data[1];
			int		e   = 0;
			int[]	lf  = new int[data[1]];
			String	out = "";
			String	lp  = "";

			while (true) {
				if (q == 0) {
					// 割り切れた
					lp = "";
					break;
				} else if (lf[q] != 0) {
					// ループした
					lp = lp.substring(0, lf[q]);
					for (int l = lf[q]; l < e; l++) {
						lp += "^";
					}
					break;
				}
				lf[q] = e++;
				p = (q * 10) / data[1];
				q = (q * 10) % data[1];
				out += String.valueOf(p);
				lp  += " ";
			}

			System.out.println(out);
			if (!lp.isEmpty()) {
				System.out.println(lp);
			}
		}
	}

	private static int[] parseData() {
		int[]	data = null;
		String	str = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");
			data    = new int[2]; 
			data[0] = Integer.parseInt(lines[0]);
			data[1] = Integer.parseInt(lines[1]);
		}

		return data;
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