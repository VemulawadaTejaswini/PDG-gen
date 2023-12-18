import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int nana = 1;
		int ans = -1;
		for (int i = 1; i <= k; i++) {
			nana = (nana * 10 + 7)  % k;
			if (nana % k == 0) {
				ans = i + 1;
				break;
			}
		}

		System.out.println(ans);


		sc.close();

	}

}
