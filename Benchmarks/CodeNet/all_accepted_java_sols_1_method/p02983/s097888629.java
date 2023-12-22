import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int mod = 0;
		int minMod = Integer.MAX_VALUE;

		for (int i = L; i < R; i++) {
			for (int j = i + 1; j <= R; j++) {
				mod = (i % 2019) * (j % 2019) % 2019;
				minMod = Math.min(minMod, mod);
				if ((j - i) % 2019 == 0) break;
			}
			if (i % 2019 == 0) break;
		}

		System.out.println(minMod);
	}
}
