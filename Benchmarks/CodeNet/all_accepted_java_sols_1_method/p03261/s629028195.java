import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] W = new String[N];
		for (int i = 0; i < N; i++) {
			W[i] = sc.next();

			for (int j = 0; j < i; j++) {
				if (W[i].equals(W[j])) {
					System.out.println("No");
					return;
				}
			}
		}

		for (int i = 1; i < N; i++) {
			if (W[i - 1].charAt(W[i - 1].length() - 1) != W[i].charAt(0)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}