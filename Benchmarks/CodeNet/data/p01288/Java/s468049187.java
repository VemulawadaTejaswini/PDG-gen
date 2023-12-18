import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] s = in.readLine().split(" ");
			int N = Integer.parseInt(s[0]);
			int Q = Integer.parseInt(s[1]);
			if (N == 0 && Q == 0) {
				break;
			}
			int[] p = new int[N + 1];
			for (int i = 2; i <= N; i++) {
				p[i] = Integer.parseInt(in.readLine());
			}
			
			char[] c = new char[Q + 1];
			int[] v = new int[Q + 1];
			boolean[] marked = new boolean[N + 1];
			marked[1] = true;
			for (int j = 1; j <= Q; j++) {
				s = in.readLine().split(" ");
				c[j] = s[0].charAt(0);
				v[j] = Integer.parseInt(s[1]);
				if (c[j] == 'M') {
					marked[v[j]] = true;
				}
			}
			int[] parent = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				parent[i] = marked[i] ? -1 : p[i];
			}
			
			long sum = 0;
			for (int j = Q; j >= 1; j--) {
				if (c[j] == 'M') {
					parent[v[j]] = p[v[j]];
				}
				if (c[j] == 'Q') {
					ArrayList<Integer> list = new ArrayList<Integer>();
					int i = v[j];
					while (parent[i] != -1) {
						list.add(i);
						i = parent[i];
					}
					for (int _i: list) {
						parent[_i] = i;
					}
					sum += i;
				}
			}
			System.out.println(sum);
		}
	}
}