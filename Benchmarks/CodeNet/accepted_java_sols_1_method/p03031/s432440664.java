import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		ArrayList<ArrayList<Integer>> s = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int k = in.nextInt();
			ArrayList<Integer> si = new ArrayList<>();
			for (int j = 0; j < k; j++) {
				si.add(in.nextInt() - 1);
			}
			s.add(si);
		}
		int[] p = new int[M];
		for (int i = 0; i < M; i++) {
			p[i] = in.nextInt();

		}
		int ans = 0;
		for (int i = 0; i < (1 << N); i++) {
			boolean isOk = true;
			for (int j = 0; j < M; j++) {
				int count = 0;
				for (Integer sw : s.get(j)) {
					if ((i & (1 << sw)) != 0) {
						count++;
					}
				}
				count %= 2;
				if (count != p[j]) {
					isOk = false;
				}
			}
			if (isOk) {
				++ans;
			}
		}
		System.out.println(ans);
		in.close();
	}
}