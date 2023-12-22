import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();
		double ans = (double)a/b;

		System.out.println(a/b + " " + a%b + " " + String.format("%.8f", ans));

		sc1.close();

	}

}
