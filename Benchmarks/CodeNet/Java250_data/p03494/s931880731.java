import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			// 自然数(0は含まない)
			int[] aArray = new int[n];
			for(int i = 0 ; i < n ; i++){
				aArray[i] = sc.nextInt();
			}

			// すべてのAが割り切れた回数
			int ans = 0;

			ONE: while(true){
				for(int i = 0 ; i < n ; i++){
					if(aArray[i] % 2 == 0){
						// 2で割り切れたら割った後の数を入れる
						aArray[i] = aArray[i] / 2;
					} else {
						// 割り切れなければ処理を終える
						break ONE;
					}
				}
				// 全ての数が2で割り切れたらカウントアップ
				ans++;
			}
			System.out.println(ans);
		}

	}

}
