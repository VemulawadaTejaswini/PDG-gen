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
		Data	data = null;
		
		while ((data = parseData()) != null) {
			System.out.println(solve(data));
		}
	}

	public static String solve(Data data) {
		String	res = "NA";
		double	min = Double.MAX_VALUE;

		do {
			double	tmp = (double)data.cr[0]+(double)data.cr[data.cr.length-1];
			for (int i = 0; i < data.cr.length-1; i++) {
				if (data.cr[i] == data.cr[i+1]) {
					tmp += (double)(data.cr[i]*2);
				} else {
					tmp += Math.sqrt(Math.pow((double)data.cr[i]+data.cr[i+1], 2.0)-Math.pow((double)data.cr[i]-data.cr[i+1], 2.0));
				}
			}
//			if (min >= tmp) {
//				min = tmp;
//				System.out.println(getPermStr(data.cr) + " " + min);
//			}
			min = Math.min(min, tmp);

			if (min <= data.wi) {
				res = "OK";
				break;
			}
		} while(next_perm(data.cr));

		return res;
	}

	static String getPermStr(int[] cr) {
		String	res = "";

		for (int i = 0; i < cr.length; i++) {
			res += (i == 0) ? String.valueOf(cr[i]) : " " + String.valueOf(cr[i]);
		}
		
		return res;
	}

	static boolean next_perm(int[] cr) {
		int		i;
		int		j;
		int		t;
		int		l = cr.length;
		boolean	r = false;
	    
		if (l > 0) {
			for(i = l - 1; i > 0 && cr[i-1] >= cr[i]; i--);

			if (i > 0) {
				for(j = l - 1; j > i && cr[i-1] >= cr[j]; j--);

				// swap(p,j,i-1);
				t = cr[j];
				cr[j] = cr[i-1];
				cr[i-1] = t;

				for(j=l-1; i < j; i++, j--){
					// swap(p,i,j);
					t = cr[i];
					cr[i] = cr[j];
					cr[j] = t;
				}

				r = true;
			}
		}

		return r;
	}

	private static Data parseData() {
		Data	data  = null;
		String	stdin  = null;

		if ((stdin = parseStdin()) != null) {
			String[]	lines = stdin.split(" ");

			data = new Data(lines.length-1);
			for(int i = 0; i < lines.length; i++) {
				if (i == 0) {
					data.wi = Integer.parseInt(lines[i]);
				} else {
					data.cr[i-1] = Integer.parseInt(lines[i]);
				}
			}
			Arrays.sort(data.cr);
		}

		return data;
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

class Data {
	int		wi = 0;
	int[]	cr = null;

	Data (int cc) {
		cr = new int[cc];
	}
}