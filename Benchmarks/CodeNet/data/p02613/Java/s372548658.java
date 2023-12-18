import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		FastReader sc = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("AC", 0);
		map.put("WA", 0);
		map.put("TLE", 0);
		map.put("RE", 0);
		while (n-- > 0) {
			String s = sc.next();
			map.put(s, map.get(s) + 1);

		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " x " + m.getValue());
		}
	}
}





class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new
		                        InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException  e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}