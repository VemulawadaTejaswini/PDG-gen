import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt4 = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 4 == 0) {
				cnt4++;
			} else if (a % 2 == 0) {
				cnt2++;
			} else {
				cnt1++;
			}
		}
		sc.close();

		if (cnt2 == 0) {
			cnt1--;
		}
		if (cnt1 <= cnt4) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
