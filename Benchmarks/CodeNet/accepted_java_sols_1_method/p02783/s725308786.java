import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int cnt = 0;
		cnt = n / m;
		
		if (n % m != 0) {
			cnt++;
		}

		System.out.println(cnt);

	}

}