import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		int ans = 0;
		double money = 100;
		double risi = 0;

		while (money < X) {
			risi = money*0.01;
			risi = Math.floor(risi);
			money = money + risi;
			ans++;
			risi = 0;
		}

		System.out.println(ans);
	}
}
