import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int N = sc.nextInt();
		int[] S = new int[N];
		for(int i = 0; i < N; i++) {
			S[i] = sc.nextInt();
		}
		insertionSort(S, N);

		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int t = sc.nextInt();
			ans += binary_search(S, t, 0, N-1);
		}

		System.out.println(ans);
		sc.close();
	}

	// 見つかれば1、見つからなければ0
	public static int binary_search(int[] a, int x, int left, int right) {
		if(left > right) {
			return 0;
		}else {
			int mid = (left + right) / 2;
			if(a[mid] == x) {
				return 1;
			}else if(a[mid] < x) {
				return binary_search(a, x, mid+1, right);
			}else {
				return binary_search(a, x, left, mid-1);
			}
		}
	}

	// 挿入ソート
		static void insertionSort(int[] a, int n) {
			for(int i = 1; i < n; i++) {
				int v = a[i];   // 挿入する要素の保存
				int j = i - 1;
				while(j >= 0 && a[j] > v) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = v;
			}
		}
}
