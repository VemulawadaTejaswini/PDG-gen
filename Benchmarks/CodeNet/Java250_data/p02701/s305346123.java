import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int N = Integer.valueOf(s);
		Set<String> hash_Set = new HashSet<String>(); 
		
		while(N-- > 0) {
			String t = sc.nextLine();
			hash_Set.add(t);
		}
		System.out.println(hash_Set.size());
	}
}

class FastReader {
	BufferedReader bf;
	StringTokenizer st;

	public FastReader() {
		bf = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(bf.readLine());
			} catch (Exception e) {
				System.out.println(e);
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
			str = bf.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return str;
	}
}

