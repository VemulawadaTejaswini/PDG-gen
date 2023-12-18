import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		long a = sc1.nextLong();
		long b = sc1.nextLong();
		long c = sc1.nextLong();
		long k = sc1.nextLong();
		long ans = 0;

		if (k%2 ==0) {
			ans = a - b;
		}
		else
		{
			ans = b - a;
		}

		if(ans >= 1000000000000000000L | ans <= -1000000000000000000L) {
			System.out.println("Unfair");
		}
		else
		{
		System.out.println(ans);
		}

		sc1.close();

	}

}