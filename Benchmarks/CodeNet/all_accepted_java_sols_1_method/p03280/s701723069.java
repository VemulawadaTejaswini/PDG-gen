import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans=(A-1)*(B-1);
		System.out.println(ans);
	}
}