import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();


		int Ans = 0;
		if(S%2 == 0) {
			--S;
		}

		for (int i = 1; i <= S; i += 2) {
			int divisorCount = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					++divisorCount;
				}
			}
			if(divisorCount == 8) {
				++Ans;
			}
		}

		System.out.println(Ans);
		//全部の数字で割り切れるか確かめる　割り切れたらCount＋＋する
		//iの約数が8個あるのかカウントする
	}

}

