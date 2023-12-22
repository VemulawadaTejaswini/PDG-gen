
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//コンソールに入力した値を取得
		int n = sc.nextInt();
		int nn = n%10;

		if (nn == 3) {
			System.out.println("bon");
		} else if (nn == 0 || nn == 1 || nn == 6 || nn == 8) {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}

		sc.close();
	}
}
