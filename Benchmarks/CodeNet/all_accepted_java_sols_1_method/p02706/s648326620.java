import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;

		//入力したm回数分繰り返す
		for(int i = 0;i < m;i++) {
			int a = sc.nextInt();
				sum += a;
		}
		//合計が日数より大きければ
		if(sum > n) {
			System.out.println(-1);
		}
		else {
			System.out.println(n-sum);
		}
		System.out.println();
		sc.close();

	}

}
