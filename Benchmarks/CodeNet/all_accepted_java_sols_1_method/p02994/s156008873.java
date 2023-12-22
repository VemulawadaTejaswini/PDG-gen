import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.close();

		int pie = 0;
		int eat = Integer.MAX_VALUE;
		Boolean eatPlus = true;
		for (int i = 0; i < N; i++) {
			pie += L + i;
			if (eat > Math.abs(L + i)) {
				eat = Math.abs(L + i);
				eatPlus = (L + i >= 0);
			}
		}
		if (eatPlus)
			pie -= eat;
		else
			pie += eat;

		System.out.println(pie);

	}
}