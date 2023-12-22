import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int b = 0;

		if (1 < k) {
			b = n - k;
		} else {
			b = 0;
		}
		System.out.println(b);

	}

}
