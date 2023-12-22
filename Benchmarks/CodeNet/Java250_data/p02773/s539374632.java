import java.util.Arrays;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}
		Arrays.sort(S);
		String current = "";
		int streak = 0;
		int max = 0;
		for (String s : S) {
			if (!s.equals(current)){
				max = Math.max(max, streak);
				streak = 1;
				current = s;
			} else {
				streak += 1;
			}
		}
		max = Math.max(max, streak);
		current = "";
		streak = 0;
		for (String s : S) {
			if (!s.equals(current)){
				if (streak == max){
					System.out.println(current);
				}
				streak = 1;
				current = s;
			} else {
				streak += 1;
			}
		}
		if (streak == max){
			System.out.println(current);
		}
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}