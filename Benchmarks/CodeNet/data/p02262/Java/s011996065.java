import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		int n = Integer.parseInt(br.readLine());
		List<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			A.add(Integer.parseInt(br.readLine()));
		
		// G?????¨?????????
		List<Integer> G = new ArrayList<Integer>();
		G.add(1);
		int m = 1;
		while (true) {
			int G_m = 2 * (G.get(m - 1) + 1) - 1;
			if (G_m > n)
				break;
			G.add(G_m);
			m++;
		}
		Collections.reverse(G);
		
		// ?????§????????????
		int cnt = 0;
		for (int k = 0; k < m; k++) {
			int g = G.get(k);
			for (int i = g; i < n; i++) {
				int v = A.get(i);
				int j = i - g;
				while (j >= 0 && A.get(j) > v) {
					A.set(j + g, A.get(j));
					j = j - g;
					cnt++;
				}
				A.set(j + g, v);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(m);
		sb.append('\n');
		for (int g : G) {
			sb.append(g);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append('\n');
		for (int a : A) {
			sb.append(a);
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}