import java.util.Scanner;

public class Main {
	private static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			String M = sc.next();
			if (N == 0) {
				sc.close();
				break;
			}

			String log = DFS(M, 0, "");
			int ans = Integer.parseInt(log.split(" ")[0]);
			if (ans == -1) {
				System.out.println("error");
				continue;
			}

			String[] pieces = log.split(" ")[1].split(",");
			int testsum = 0;
			for (int i = 0; i < pieces.length; i++) {
				if (!pieces[i].equals("")) {
					testsum += Integer.parseInt(pieces[i]);
				}
			}
			if (testsum > ans) {
				System.out.println("rejected");
				continue;
			}

			System.out.print(ans);
			for (int i = 0; i < pieces.length; i++) {
				if (!pieces[i].equals("")) {
					System.out.print(" " + pieces[i]);
				}
			}
			System.out.println();

		}

	}

	static String DFS(String rest, int sum, String log) {
		int ans = -1;
		String logger = "";
		for (int i = 1; i <= rest.length(); i++) {
			int p = Integer.parseInt(rest.substring(0, i));
			if (i == rest.length()) {
				if (sum + p <= N) {
					if (sum + p > ans) {
						ans = sum + p;
						logger = log + "," + rest.substring(0, i);
					} else if (sum + p == ans) {
						logger = logger + "," + log + ","
								+ rest.substring(0, i);
					}
				}
			} else if (sum + p <= N) {
				String t = DFS(rest.substring(i), sum + p,
						log + "," + rest.substring(0, i));
				int tmp = Integer.parseInt(t.split(" ")[0]);
				if (tmp <= N && tmp > 0) {
					if (ans < tmp) {
						ans = tmp;
						logger = t.split(" ")[1];
					} else if (ans == tmp) {
						logger = logger + "," + t.split(" ")[1];
					}
				}
			}

		}

		return String.valueOf(ans) + " " + logger;

	}
}