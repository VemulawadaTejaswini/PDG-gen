import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			int[] total = new int[n];
			int[] start = new int[n];
			boolean[] inside = new boolean[n];
			for (int l = 0; l < n; l++) {
				String d = sc.next();
				String[] t = sc.next().split(":");
				int h = Integer.parseInt(t[0]);
				int m = Integer.parseInt(t[1]);
				int now = h * 60 + m;
				String io = sc.next();
				int id = Integer.parseInt(sc.next());

				if (io.equals("I") && id == 0) {
					// 神がログインした時
					inside[id] = true;
					for (int i = 1; i < inside.length; i++) {
						if (inside[i]) {
							start[i] = now;
						}
					}
				} else if (io.equals("O") && id == 0) {
					// 神がログアウトした時
					inside[id] = false;
					for (int i = 1; i < inside.length; i++) {
						if (inside[i]) {
							total[i] += now - start[i];
						}
					}
				} else if (io.equals("I") && id != 0) {
					// 人がログインした時
					inside[id] = true;
					if (inside[0]) {
						start[id] = now;
					}
				} else if (io.equals("O") && id != 0) {
					// 人がログアウトした時
					inside[id] = false;
					if (inside[0]) {
						total[id] += now - start[id];
					}
				}
			}

			int max = 0;
			for (int i = 1; i < total.length; i++) {
				max = Math.max(max, total[i]);
			}
			System.out.println(max);
		}
	}
}