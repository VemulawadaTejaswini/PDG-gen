import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		long ans = 0;

		long b = a / 15;
		long c = a % 15;

		ans += ((b * (b + 1)) * 60 - 60 * b);

		long x =  b * 15;

		if(c == 0) {
			ans += 0;
		} else if(c == 1) {
			ans += x + 1;
		} else if(c == 2 || c == 3) {
			ans += x + 1 + x + 2;
		} else if(c == 4 || c == 5 || c == 6) {
			ans += x + 1 + x + 2 + x + 4;
		} else if(c == 7) {
			ans += x + 1 + x + 2 + x + 4 + x + 7;
		} else if(c == 8 || c == 9 || c == 10) {
			ans += x + 1 + x + 2 + x + 4 + x + 7 + x + 8;
		} else if(c == 11 || c == 12) {
			ans += x + 1 + x + 2 + x + 4 + x + 7 + x + 8 + x + 11;
		} else if(c == 13) {
			ans += x + 1 + x + 2 + x + 4 + x + 7 + x + 8 + x + 11 + x + 13;
		} else if(c == 14) {
			ans += (120*(b+1) - 60);
		}

		System.out.println(ans);

		sc.close();
	}

}