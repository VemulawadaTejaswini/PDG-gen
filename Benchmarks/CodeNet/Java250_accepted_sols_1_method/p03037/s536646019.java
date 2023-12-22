import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int lmax = 0;
		int rmin = n;
		// カードの枚数は、Lの最大値以上Rの最小値以下
		for (int i = 0; i < m; i++) {
			lmax = Math.max(lmax, scanner.nextInt());
			rmin = Math.min(rmin, scanner.nextInt());
		}
		
		System.out.println(Math.max(rmin + 1 - lmax, 0));
	}
}
