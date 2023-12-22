import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();

		int ans = Math.max(A1, Math.max(A2, A3)) - Math.min(A1, Math.min(A2, A3));
		System.out.println(ans);
	}
}