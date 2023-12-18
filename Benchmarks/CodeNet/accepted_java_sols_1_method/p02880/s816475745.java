import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean canCalc = false;
		outer:
		for (int i = 1; i * i <= n; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j == n) {
					canCalc = true;
					break outer;
				}
			}
		}
		String ans = canCalc ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}

}
