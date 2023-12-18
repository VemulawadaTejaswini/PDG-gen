import java.util.*;
public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int INF = Integer.MAX_VALUE/2;
		StringBuilder ans = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int D = Integer.parseInt(sc.next());
		int[] c = new int[26];
		Arrays.setAll(c, i -> Integer.parseInt(sc.next()));
		int[][] s = new int[D][26];
		for(int i = 0; i < D; i++)
			Arrays.setAll(s[i], x -> Integer.parseInt(sc.next()));
		sc.close();
		int[] con = new int[D];
		Map<Integer, TreeSet<Integer>> used = new HashMap<>();
		for(int i = 0; i < 26; i++) {
			used.put(i, new TreeSet<>());
			used.get(i).add(-1);
		}
		for(int d = 0; d < D; d++) {
			int max = -INF, now = 0;
			for(int i = 0; i < 26; i++) {
				int temp = 0;
				temp += s[d][i];
				for(int j = 0; j < 26; j++)
					if(i != j)
						temp -= c[j] * (d - used.get(j).last());
				if(max < temp) {
					max = temp;
					now = i;
				}
			}
			con[d] = now;
			used.get(now).add(d);
		}
		for(int i = 0; i < 26; i++)
			used.get(i).add(D);
		Random r = new Random();
		while(true) {
			int d = r.nextInt(D);
			for(int q = 0; q < 26; q++) {
				int temp = 0;
				temp -= s[d][con[d]];
				temp += s[d][q];
				temp -= c[con[d]] * (used.get(con[d]).ceiling(d) - d) * (d - used.get(con[d]).lower(d));
				temp += c[q] * (d - used.get(q).lower(d)) * (used.get(q).ceiling(d) - d);
				if(temp > 0) {
					con[d] = q;
					used.get(con[d]).remove(d);
					used.get(q).add(d);
				}
			}
			if(System.currentTimeMillis() - start > 1850)
				break;
		}
		for(int i : con)
			ans.append((i+1) + "\n");
		System.out.println(ans);
	}

}
