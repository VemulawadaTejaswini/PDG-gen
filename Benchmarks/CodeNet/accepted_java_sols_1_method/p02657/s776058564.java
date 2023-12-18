
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//コンソールに入力した値を取得
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a*b);

		sc.close();
	}
}
