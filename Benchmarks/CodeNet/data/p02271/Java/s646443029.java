import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int Q = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < Q; i++) {
			int M = sc.nextInt();
			if(exhaustiveSearch(A, 0, M)) {
				ans.append("yes\n");
			}else {
				ans.append("no\n");
			}
		}

		System.out.print(ans);
		sc.close();
	}

	//aのi番目以降の要素を使ってｍを作れる場合trueを返す
	public static boolean exhaustiveSearch(int[] a, int i, int m) {
		if(m == 0) {
			return true;
		}
		if(i >= a.length || m < 0) {
			return false;
		}
		// a[i]を選択しない（加えない）||a[i]を選択する（加える）
		boolean res = exhaustiveSearch(a, i + 1, m) || exhaustiveSearch(a, i + 1, m - a[i]);
		return res;
	}
}
