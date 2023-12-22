import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] candidates = new double[n];

		sc.nextLine();
		int t = sc.nextInt();
		int a = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			candidates[i] = t - (sc.nextInt() * 0.006);
		}

		int index = 0;
		int ans = 0;
		double diff = 9999;
		for (double candidate : candidates) {

			if (((double) a - candidate) < 0) {
				if ((candidate - (double) a) < diff) {
					diff = (candidate - (double) a);
					ans = index + 1;
				}
			} else {
				if (((double) a - candidate) < diff) {
					diff = ((double) a - candidate);
					ans = index + 1;
				}
			}
			index++;
		}

		System.out.println(ans);

	}

}
