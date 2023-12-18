import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int[] c = new int[26];
		Arrays.setAll(c, i -> sc.nextInt());
		int[][] s = new int[D][26];
		for(int i = 0; i < D; i++)
			Arrays.setAll(s[i], x -> sc.nextInt());
		int[] con = new int[D];
		TreeSet<Integer>[] used = new TreeSet[26];
		for(int i = 0; i < 26; i++) {
			used[i] = new TreeSet<>();
			used[i].add(-1);
		}
		int sat = 0;
		for(int d = 0; d < D; d++) {
			int t = sc.nextInt()-1;
			con[d] = t;
			used[t].add(d);
			sat += s[d][t];
			for(int j = 0; j < 26; j++)
				sat -= c[j] * (d - used[j].last());
		}
		for(int i = 0; i < 26; i++)
			used[i].add(D);
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int d = sc.nextInt()-1;
			int q = sc.nextInt()-1;
			sat -= s[d][con[d]];
			sat += s[d][q];
			used[con[d]].remove(d);
			sat -= c[con[d]] * (used[con[d]].ceiling(d) - d) * (d - used[con[d]].lower(d));
			sat += c[q] * (d - used[q].lower(d)) * (used[q].ceiling(d) - d);
			con[d] = q;
			used[q].add(d);
			System.out.println(sat);
		}
	}

}