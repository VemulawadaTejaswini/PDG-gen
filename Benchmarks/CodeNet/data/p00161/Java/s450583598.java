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
		int		num = 0;

		while((num = parseNum()) != 0) {
			int[][]	rec = new int[4][4];
			rec[0][1] = Integer.MAX_VALUE;
			rec[1][1] = Integer.MAX_VALUE;
			rec[2][1] = Integer.MIN_VALUE;
			rec[3][1] = Integer.MIN_VALUE;
			for (int i = 0; i < num; i++) {
				int[]	tmp = parseRec();
				if (i == 0) {
					rec[0] = rec[3] = tmp;
				} else {
					if (tmp[1] < rec[0][1]) {
						rec[1] = rec[0];
						rec[0] = tmp;
					} else if (tmp[1] < rec[1][1]) {
						rec[1] = tmp;
					}

					if (tmp[1] > rec[3][1]) {
						rec[2] = rec[3];
						rec[3] = tmp;
					} else if (tmp[1] > rec[2][1]) {
						rec[2] = tmp;
					}
				}
			}

			System.out.println(rec[0][0]);
			System.out.println(rec[1][0]);
			System.out.println(rec[2][0]);
		}
	}

	private static int parseNum() {
		int		param = 0;
		String	strin = null;

		if ((strin = parseStdin()) != null) {
			param = Integer.parseInt(strin);
		}
 
		return param;
	}

	private static int[] parseRec() {
		int[]	param = null;
		String	strin = null;

		if ((strin = parseStdin()) != null) {
			String[]	lines = strin.split(" ");

			param    = new int[2];
			param[0] = Integer.parseInt(lines[0]);
			for (int i = 1; i < lines.length; i+=2) {
				param[1] += Integer.parseInt(lines[i])*60+Integer.parseInt(lines[i+1]);
			}
		}
 
		return param;
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