import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main res = new Main();
		StringBuilder result = new StringBuilder();
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1)
				break;
			result.append(res.grading(m, f, r));
			result.append("\n");
		}
		System.out.print(result);
	}
	public char grading(int m, int f, int r) {
		if (m == -1 | f == -1)
			return 'F';
		int total = m + f;
		if (total >= 80)
			return 'A';
		if (/* 80 > */total >= 65)
			return 'B';
		if (/* 65 > */total >= 50)
			return 'C';
		if (/* 50 > */total >= 30) {
			if (r >= 50)
				return 'C';
			// r < 50:
			return 'D';
		}
		// total < 30:
		return 'F';
	}
}
