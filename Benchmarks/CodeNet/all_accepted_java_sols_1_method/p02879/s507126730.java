import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int ans = 0;
		
      	//9以下の数字の場合
		if (A <= 9 && B <= 9) {
			ans = A * B;
			System.out.println(ans);
		//9以上の数字の場合	
		}else {
			System.out.println(-1);
		}
	}
}