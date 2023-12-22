import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int S = scan.nextInt();

		//結果出力
		System.out.println(S ^ 1);
	}
}