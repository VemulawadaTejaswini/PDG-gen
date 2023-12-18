import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		
		// 結果の出力
		int tmp = 1;
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (sc.nextInt() == tmp) {
				tmp++;
			}
			else {
				count++;
			}
		}
		System.out.println(tmp == 1? -1 : count);
		
		sc.close();
	}
}
