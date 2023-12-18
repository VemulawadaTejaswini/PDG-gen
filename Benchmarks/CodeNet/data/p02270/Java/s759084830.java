import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  // 荷物の数
		int K = sc.nextInt();  // トラックの数
		int[] W = new int[N];  // 各荷物の重さ
		int[] truck = new int[K];  // トラック🚚
		int left = 0;         // 荷物の重さの最大値（最低でも必要な積載量）
		int right = 0;        // 荷物の重さの合計値（トラック最大の積載量）

		for(int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			if(W[i] > left) {
				left = W[i];
			}
			right += W[i];
		}

		int p = 0;  // トラックの最大積載量p(こいつを求める)
		while(left <= right) {
			int mid = (left + right) / 2;
			int j = 0;  // 荷物配列用インデックス
			for(int i = 0; i < K; i++) {
				while(j < N && (truck[i] + W[j]) <= mid) {  // トラックへの詰め込み
					truck[i] += W[j];
					j++;
				}
			}
			if(j == N) {  // トラック詰め込み成功
				p = mid;
				right = mid - 1;
			}else {
				left = mid + 1;
			}

			initialize_array(truck);
		}

		System.out.println(p);
		sc.close();
	}

	public static void initialize_array(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
	}
}
