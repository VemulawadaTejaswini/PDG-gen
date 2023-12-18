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
		long[]	formula = null;

		while ((formula = parseFormula()) != null) {
			calc(formula);
		}
	}

	private static void calc(long[] formula) {
		String	out = "NA";
		long	x   = formula[3] - formula[1];
		long	n   = formula[0] - formula[2];

		if (x != 0L) {
			if (n % x == 0L) {
				long	res = n / x;
				if (!(res == 0L && formula[4] != 0L) && (0L <= res && res <= 9L)) {
					out = String.valueOf(res);
				}
			}
		}

		System.out.println(out);
	}

	private static long[] parseFormula() {
		long[]	formula = null;
		String	str     = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split("[+=]");

			formula = new long[5];

			for (int l = 0; l < lines.length; l++) {
				int		diff = (l == lines.length - 1) ? 2 : 0;
				long[]	line = parseLine(lines[l]);

				formula[0+diff] += line[0];
				formula[1+diff] += line[1];
				formula[4]      |= line[2];
			}
		}

		return formula;
	}

	private static long[] parseLine(String stdin) {
		long[]	line = new long[3];

		if (stdin != null) {
			if (!stdin.isEmpty()) {
				int	size = stdin.length();
				for (int l = size-1; l >= 0; l--) {
					char	c = stdin.charAt(l);
					long	b = (long)Math.pow(10, size - 1 - l);
					if (c == 'X') {
						line[1] += b;
						line[2]  = (l == 0) ? 1 : 0;
					} else {
						line[0] += (int)(c - '0') * b;
					}
				}
			}
		}

		return line;
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