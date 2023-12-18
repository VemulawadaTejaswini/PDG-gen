import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] B;

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		B = new int[N];
		for (int i = 0; i < N; ++i) {
			B[i] = sc.nextInt();
		}
		int[] target = new int[N];
		int pos = 0;
		int val = 0;
		for (int i = 0; i < M; ++i) {
			int P = sc.nextInt();
			for (int j = 0; j < P; ++j) {
				target[pos++] = val;
			}
			val ^= 1;
		}
		int ans = solve(target);
		for (int i = 0; i < N; ++i) {
			target[i] ^= 1;
		}
		ans = Math.min(ans, solve(target));
		System.out.println(ans);
	}

	static int solve(int[] target) {
		int sum = 0;
		for (int i = 0; i < B.length; ++i) {
			sum += B[i];
			sum -= target[i];
		}
		if (sum != 0) return 999;
		ArrayList<Integer> pos1 = new ArrayList<>();
		ArrayList<Integer> pos2 = new ArrayList<>();
		for (int i = 0; i < B.length; ++i) {
			if (B[i] == 0) pos1.add(i);
			if (target[i] == 0) pos2.add(i);
		}
		int ret = 0;
		for (int i = 0; i < pos1.size(); ++i) {
			ret += Math.abs(pos1.get(i) - pos2.get(i));
		}
		return ret;
	}

}