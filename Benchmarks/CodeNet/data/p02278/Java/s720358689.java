
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = 0;
		int min = 1 << 16;
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			num[i] = t;
			max = Math.max(max, t);
			min = Math.min(min, t);
		}
		boolean[] b = new boolean[n];
		int[] sortnum = Arrays.copyOf(num, n);
		Arrays.sort(sortnum);
		List<Integer> list = new ArrayList<Integer>();
		for (int t : sortnum)
			list.add(t);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int s = 0;
			int an = 0;
			int cur = i;
			int m = max;
			while (true) {
				b[cur] = true;
				an++;
				int v = num[cur];
				m = Math.min(m, v);
				s += v;
				cur = list.indexOf(v);
				if (b[cur])
					break;
			}
			int aa = s + (an - 2) * m;
			int bb = s + m + (an + 1) * min;
			ans += Math.min(aa, bb);
		}
		System.out.println(ans);
	}
}