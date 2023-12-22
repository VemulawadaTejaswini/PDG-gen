import java.util.Scanner;

//AtCoder Beginner Contest 145
//B	Echo
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		if (N % 2 == 1) {
			System.out.println("No");
			return;
		}

		for (int i = 0; i < (N / 2); i++) {
			if (S.charAt(i) != S.charAt((N / 2) + i)) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
