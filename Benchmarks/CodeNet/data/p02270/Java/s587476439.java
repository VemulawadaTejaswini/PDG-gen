import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] w = new int[n];

		long r = 0;
		long l = 0;
		
		for (int i = 0; i < n; i++) {
			w[i] = scan.nextInt();	
			r += w[i];
			l = Math.max(l, w[i]);
		}

		// 二分探索
		while (l < r) {
			// 現在試している積載量p
			long m = (l + r) / 2;
			// 各トラックの搭載量
			long sum = 0;
			// 現在荷物を載せているトラックのid
			int kId = 0;
			
			// 全荷物を載せていく
			for (int i = 0; i < n; i++) {
				// 荷物を載せるとpを超えるようなら次のトラックへ
				if (sum + w[i] > m) {
					sum = w[i];
					kId++;
				}
				else {
					sum += w[i];
				}

				// トラックの数がkを超えるようなら終了
				if (kId == k) {
					break;
				}
			}
			
			// pで積載可能ならばpを小さくする
			if (kId != k) {
				r = m;
			}
			else {
				l = m + 1;
			}
		}

		System.out.println(l);

		scan.close();
	}
}