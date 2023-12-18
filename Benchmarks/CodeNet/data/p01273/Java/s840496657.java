import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			boolean[] inf = new boolean[n];
			inf[0] = true;
			for (int i = 1; i < inf.length; i++)
				inf[i] = false;
			int[] t = new int[m];
			int[] s = new int[m];
			int[] d = new int[m];
			int time = 0;
			for (int i = 0; i < m; i++) {
				t[i] = sc.nextInt();
				s[i] = sc.nextInt() - 1;
				d[i] = sc.nextInt() - 1;
				time = Math.max(time, t[i]);
			}
			for (int i = 0; i <= time; i++)
				for (int j = 0; j < m; j++)
					if (t[j] == i && inf[s[j]] && !inf[d[j]])
						inf[d[j]] = true;
			int result = 0;
			for (int i = 0; i < inf.length; i++)
				if (inf[i])
					result++;
			System.out.println(result);
		}
		sc.close();
	}
}