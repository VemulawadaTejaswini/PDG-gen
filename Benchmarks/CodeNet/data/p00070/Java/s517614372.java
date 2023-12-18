import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[][] table;
	boolean[] use;

	void run() {
		table = new int[10][286];
		use = new boolean[10];
		make(0, 0);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			System.out.println((n > 9 || s > 285) ? 0 : table[n][s]);
		}
	}

	void make(int depth, int sum) {
		if (depth == 10) return;
		table[depth][sum]++;
		for (int i = 0; i < 10; i++) {
			if (use[i]) continue;
			use[i] = true;
			make(depth + 1, sum + i * (depth + 1));
			use[i] = false;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}