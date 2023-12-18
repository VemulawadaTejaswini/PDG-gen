import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int M;
	static int[] memo = new int[1 << 22];

	public static void main(String[] args) {
		while (true) {
			M = sc.nextInt();
			int N = sc.nextInt();
			if (M == 0) break;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < N; ++i) {
				list.add(Integer.parseInt(sc.next(), 2));
			}
			Arrays.fill(memo, -1);
			System.out.println(rec(0, list));
		}
	}

	static int rec(int used, ArrayList<Integer> list) {
		if (list.size() <= 1) return 0;
		if (memo[used] >= 0) return memo[used];
		int ret = 99;
		for (int i = 0; i < M; ++i) {
			if ((used & (3 << (2 * i))) != 0) continue;
			ArrayList<Integer> on = new ArrayList<Integer>();
			ArrayList<Integer> off = new ArrayList<Integer>();
			for (int v : list) {
				if ((v & (1 << i)) != 0) {
					on.add(v);
				} else {
					off.add(v);
				}
			}
			if (on.isEmpty() || off.isEmpty()) continue;
			ret = Math.min(ret, Math.max(rec(used | (1 << (2 * i)), on), rec(used | (2 << (2 * i)), off)));
		}
		memo[used] = ret + 1;
		return ret + 1;
	}

}