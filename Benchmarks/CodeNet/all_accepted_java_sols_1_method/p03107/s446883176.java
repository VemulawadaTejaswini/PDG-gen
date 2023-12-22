import java.util.Scanner;

//AtCoder Beginner Contest 120
//C	Unification
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		sc.close();

		int N = S.length();

		int red = 0;
		int blue = 0;

		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '0') red++;
			if (S.charAt(i) == '1') blue++;
		}

		System.out.print(Math.min(red, blue) * 2);
	}
}
