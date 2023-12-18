import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int as[] = new int[n];
		int vs[] = new int[n];
		int max = 0;
		int maxix = 0;
		for (int i = 0; i < n; i++) {
			as[i] = sc.nextInt();
			vs[i] = sc.nextInt();
			if (max < vs[i]) {
				max = vs[i];
				maxix = as[i];
			} else if (max == vs[i] && maxix > as[i]) {
				maxix = as[i];
			}
		}

		System.out.println(maxix + " " + max);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}