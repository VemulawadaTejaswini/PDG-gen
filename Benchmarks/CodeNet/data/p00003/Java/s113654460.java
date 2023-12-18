import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int qNum = sc.nextInt();

		for (int i = 0; i < qNum; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a*a == b*b + c*c) {
				System.out.println("YES");
				break;
			}
			if (b*b == a*a + c*c) {
				System.out.println("YES");
				break;
			}
			if (c*c == a*a + b*b) {
				System.out.println("YES");
				break;
			}
			System.out.println("NO");
		}

		if (sc != null) {
			sc.close();
		}
	}
}