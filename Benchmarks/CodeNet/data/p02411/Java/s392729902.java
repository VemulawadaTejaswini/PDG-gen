import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1) break;
			System.out.println(grade(m, f, r));
		}
		sc.close();
	}
	
	private static char grade(int m, int f, int r) {
		int mf = m + f;
		if (m == -1 || f == -1 || mf < 30) {
			return 'F';
		} else if (30 <= mf && mf < 50) {
			if (r >= 50) {
				return 'C';
			}
			return 'D';
		} else if (50 <= mf && mf < 65) {
			return 'C';
		} else if (65 <= mf && mf < 80) {
			return 'B';
		} else {
			return 'A';
		}
	}
}