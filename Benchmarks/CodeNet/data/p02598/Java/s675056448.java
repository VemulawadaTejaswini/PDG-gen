import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//数字の入力
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int maxA = A[0];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			if (A[i] > maxA) {
				maxA = A[i];
			}
		}
		//K回のカットですべてを長さXにできるか？
		//二分探索
		int x = maxA;//初期値最大値
		int y = 0;//初期値0
		int mid = 0;
		while (x - y > 1) {
			mid = (x + y) / 2;//中間値
			//
			double sumCn = 0;//回数の合計
			for (int i = 0; i < N; i++) {
				sumCn += (int)Math.ceil((double) A[i] / mid) - 1;
			}
			//xとyを更新
			if(sumCn<=K) {
				x = mid;
			}else {
				y = mid;
			}
		}
		System.out.println(y);

	}

}
