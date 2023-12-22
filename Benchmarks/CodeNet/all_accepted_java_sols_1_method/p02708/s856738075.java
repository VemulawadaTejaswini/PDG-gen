import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.next());		//個数（10^10 + 0 ～ +N）
		long k = Long.parseLong(sc.next());		//選ぶ個数（＜＝n+1）

		long ans = 0;

		for(long i = k; i <= n + 1; i++) {
			long max = 0;
			long min = 0;

			min = i * (i - 1) / 2;
			//System.out.print(min);
			max = (n + (n - i + 1)) * i / 2;
			//System.out.print(max);

			ans += ((max - min + 1) % (1000000000 + 7));
			//System.out.println(max + "," + min );
		}

		ans %= (1000000000 + 7);

		System.out.println(ans);

		sc.close();
	}

}