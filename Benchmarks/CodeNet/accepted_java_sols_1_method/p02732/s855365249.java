import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		long[] cnt = new long[N];

		//各番号ごとの組み合わせを計算する
		for(int i = 0; i < N; i++) {
			cnt[nums[i]-1] ++;
		}

		long result = 0;
		//各項目の組み合わせを計算する。
		for(int i = 0; i < N; i++) {
			long count = 0;
			long num = cnt[i];
			for(long j = 1; j < num; j++) {
				count = count + num - j;
			}
			result = result + count;
		}

		for(int i = 0; i < N; i++) {
			System.out.println(result - (cnt[nums[i]-1] - 1));
		}
	}
}