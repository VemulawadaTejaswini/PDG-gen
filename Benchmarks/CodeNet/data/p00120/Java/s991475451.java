import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
 
public class Main {
	private	static	BufferedReader	br = null;
	private	static	double[][]		cd = null;
	private	static	int[]			rr = { Integer.MAX_VALUE, Integer.MIN_VALUE };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		size = 0;
		Data	data = null;
		DataTbl	tbl  = new DataTbl();
		
		while ((data = parseData()) != null) {
			tbl.add(data);
		}

		calcDist();

		size = tbl.size();
		for (int i = 0; i < size; i++) {
			data = tbl.get(i);
			System.out.println(solve(data));
		}
	}

	public static String solve(Data data) {
		String				res = "NA";
		double				min = 0.0;
		int					len = data.cr.length;
		int					tmp = 0;
		int					nei = 0;
		ArrayDeque<Integer>	out = new ArrayDeque<Integer>();

		for (int i = 0, j = 0; out.size() < len; i = (i+1)%4) {
			switch (i) {
			case	0:
				tmp = data.cr[j];
				if (out.size() > 0) {
					nei = out.getFirst();
					min += cd[tmp-rr[0]][nei-rr[0]];
				}
				out.addFirst(tmp);
				break;
			case	1:
				tmp  = data.cr[len-1-j];
				nei  = out.getLast();
				min += cd[tmp-rr[0]][nei-rr[0]];
				out.addLast(tmp);
				j++;
				break;
			case	2:
				tmp  = data.cr[j];
				nei  = out.getLast();
				min += cd[tmp-rr[0]][nei-rr[0]];
				out.addLast(tmp);
				break;
			case	3:
				tmp  = data.cr[len-1-j];
				nei  = out.getFirst();
				min += cd[tmp-rr[0]][nei-rr[0]];
				out.addFirst(tmp);
				j++;
				break;
			}
		}

		min += (double)out.getFirst() + (double)out.getLast();

		if (min <= data.wi) {
			res = "OK";
		}

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

	public static void calcDist() {
		int	sz = rr[1]-rr[0];

		cd = new double[sz+1][sz+1];
		for (int i = 0; i <= sz; i++) {
			for (int j = i; j <= sz; j++) {
				double	d = 0.0;
				if (i == j) {
					d = (double)((rr[0]+i)*2);
				} else {
					d = Math.sqrt(Math.pow((double)(rr[0]*2+j+i), 2.0)-Math.pow((double)(j-i), 2.0));
				}
				cd[i][j] = d;
				cd[j][i] = d;
			}
		}
	}

	private static Data parseData() {
		Data	data  = null;
		String	stdin  = null;

		if ((stdin = parseStdin()) != null) {
			String[]	lines = stdin.split(" ");

			data = new Data(lines.length-1);
			for(int i = 0; i < lines.length; i++) {
				if (i == 0) {
					data.wi = Double.parseDouble(lines[i]);
				} else {
					data.cr[i-1] = Integer.parseInt(lines[i]);
					rr[0] = Math.min(rr[0], data.cr[i-1]);
					rr[1] = Math.max(rr[1], data.cr[i-1]);
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

class DataTbl extends ArrayList<Data> {
}

class Data {
	double		wi = 0;
	int[]		cr = null;

	Data (int cc) {
		cr = new int[cc];
	}
}