
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());

		int[] ans = new int[len + 1];

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					int let = i*i+j*j+k*k+i*j+j*k+k*i;
					if (let <= len) {
						ans[let]++;
					}
				}
			}
		}

		for (int i = 1; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}
}