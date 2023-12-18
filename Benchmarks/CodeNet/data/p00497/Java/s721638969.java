import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<ArrayList<Integer>> plusS = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> plusE = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> minusS = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> minusE = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N + 2; ++i) {
			plusS.add(new ArrayList<Integer>());
			plusE.add(new ArrayList<Integer>());
			minusS.add(new ArrayList<Integer>());
			minusE.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < M; ++i) {
			int A = Integer.parseInt(sc.next());
			int B = Integer.parseInt(sc.next());
			int X = Integer.parseInt(sc.next());
			plusS.get(A).add(B);
			minusS.get(A).add(B + 1);
			plusE.get(A + X + 1).add(B);
			minusE.get(A + X + 1).add(B + 1 + X + 1);
		}
		int[][] psum = new int[2][N + 2];
		int[][] msum = new int[2][N + 2];
		int[] sum = new int[N + 2];
		int ans = 0;
		int t = 1;
		for (int i = 1; i <= N; ++i) {
			Arrays.fill(psum[t], 0);
			Arrays.fill(msum[t], 0);
			Arrays.fill(sum, 0);
			for (int j : plusS.get(i)) {
				psum[t][j]++;
			}
			for (int j : plusE.get(i)) {
				psum[t][j]--;
			}
			for (int j : minusS.get(i)) {
				msum[t][j]++;
			}
			for (int j : minusE.get(i)) {
				msum[t][j]--;
			}
			for (int j = 1; j <= i; ++j) {
				psum[t][j] += psum[1 - t][j];
				msum[t][j] += msum[1 - t][j - 1];
			}
			for (int j = 1; j <= i; ++j) {
				sum[j] = sum[j - 1] + psum[t][j] - msum[t][j];
				if (sum[j] > 0) ++ans;
			}
			t = 1 - t;
		}
		System.out.println(ans);
	}
}