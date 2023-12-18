import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		long N = sc.nextLong();
		long K = sc.nextLong();

		long a = N % K;
		System.out.println(Math.min(a, K - a));

	}
}