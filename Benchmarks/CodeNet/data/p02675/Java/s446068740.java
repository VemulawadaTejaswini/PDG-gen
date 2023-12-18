import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		String ans = null;

		switch (n % 10) {
		case 3:
			ans = "bon";
			break;
		case 0:
		case 1:
		case 6:
		case 8:
			ans = "pon";
			break;
		default:
			ans = "hon";
		}

		System.out.println(ans);
	}

}
