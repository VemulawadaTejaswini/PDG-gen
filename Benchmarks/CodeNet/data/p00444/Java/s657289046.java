import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] price = { 500, 100, 50, 10, 5, 1 };

	public static void main(String[] args) {
		while (true) {
			int N = 1000 - sc.nextInt();
			if (N == 1000) break;
			int ans = 0;
			for (int i = 0; i < price.length; ++i) {
				while (N >= price[i]) {
					N -= price[i];
					++ans;
				}
			}
			System.out.println(ans);
		}
	}

}