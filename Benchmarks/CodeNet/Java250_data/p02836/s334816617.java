import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		char[] chars = S.toCharArray();
		int counter = 0;
		for (int i = 0; i < chars.length / 2; i++) {
			char forward = chars[i];
			char back = chars[chars.length - i - 1];
			if (forward != back) counter++;
		}
		System.out.println(counter);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}