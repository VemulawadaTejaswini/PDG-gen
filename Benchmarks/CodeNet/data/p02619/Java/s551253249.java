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
		int[] last = new int[26];
		int sat = 0;
		for(int d = 1; d <= D; d++) {
			int t = sc.nextInt()-1;
			last[t] = d;
			sat += s[d-1][t];
			for(int j = 0; j < 26; j++)
				sat -= c[j] * (d - last[j]);
			System.out.println(sat);
		}
		
	}

}
