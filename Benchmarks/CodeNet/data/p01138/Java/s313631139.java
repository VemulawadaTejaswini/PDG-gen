import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			String[] depstr = new String[n];
			String[] arrstr = new String[n];
			int[] deptime = new int[n];
			int[] arrtime = new int[n];
			int[] rank = new int[n];
			for (int i = 0; i < n; i++) {
				depstr[i] = sc.next();
				String[] depstrs = depstr[i].split(":");
				deptime[i] = Integer.parseInt(depstrs[0]) * 3600
						+ Integer.parseInt(depstrs[1]) * 60
						+ Integer.parseInt(depstrs[2]);
				arrstr[i] = sc.next();
				String[] arrstrs = arrstr[i].split(":");
				arrtime[i] = Integer.parseInt(arrstrs[0]) * 3600
						+ Integer.parseInt(arrstrs[1]) * 60
						+ Integer.parseInt(arrstrs[2]);
				rank[i] = 1;
				for (int j = 0; j < i; j++) {
					if (deptime[i] < deptime[j])
						rank[j]++;
					else if (deptime[i] == deptime[j]) {
						if (arrtime[i] < arrtime[j])
							rank[j]++;
						else
							rank[i]++;
					} else
						rank[i]++;
				}
			}
			int max = 0;

			for (int i = 0; i < n; i++) {
				int r = 0;
				for (int j = 0; j < n; j++) {
					if (rank[i] <= rank[j] && arrtime[i] > deptime[j])
						r++;
				}
				max = Math.max(max, r);
			}
			System.out.println(max);
		}
		sc.close();
	}
}