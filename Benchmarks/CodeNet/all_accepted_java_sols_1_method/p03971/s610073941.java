import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();

		int kaiJun = 0;
		int tuka = 0;
		for (int i = 1; i <= n; i++) {
			if ('a' == s.charAt(i - 1) && tuka < a + b) {
				System.out.println("Yes");
				tuka++;
			} else if ('b' == s.charAt(i - 1) ) {
				kaiJun++;
				if (tuka < a + b && kaiJun <= b) {
					System.out.println("Yes");
					tuka++;
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}

		sc.close();
	}

}
