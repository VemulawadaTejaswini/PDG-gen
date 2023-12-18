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
		long[]	data = null;

		while ((data = parseData()) != null) {
			long	out = (data[0] / gcd(data[0], data[1])) * data[1];
			out = (out / gcd(out, data[2])) * data[2];
			System.out.println(out);
		}
	}

	private static long gcd(long n1, long n2) {
		long	min = Math.min(n1, n2);
		long	max = Math.max(n1, n2);
		long	ret = max;
 
		if (min != 0L) {
			ret = gcd(min, max % min);
		}

		return ret;
	}

    private static long parsePeriod(long a, long m) {
		long	p = 1L;
		long	b = a % m;
		long	x = b;

		while (x != 1) {
			x = (x * b) % m;
			p++;
		}

		return p;
	}

    private static long[] parseData() {
		long[]	data = null;
		String	str = null;

		if ((str = parseStdin()) != null) {
			if (!str.equals("0 0 0 0 0 0")) {
				String[]	lines = str.split(" ");

				data    = new long[3]; 
				data[0] = parsePeriod(Long.parseLong(lines[0]), Long.parseLong(lines[1]));
				data[1] = parsePeriod(Long.parseLong(lines[2]), Long.parseLong(lines[3]));
				data[2] = parsePeriod(Long.parseLong(lines[4]), Long.parseLong(lines[5]));
			}
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