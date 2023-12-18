import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int coin = 0;
		int ans = 0;

		while(coin < C) {
			coin += A;
			ans ++;
			if(ans % 7 == 0) {
				coin += B;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
