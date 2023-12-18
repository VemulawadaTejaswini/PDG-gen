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

			boolean[][] sche = new boolean[31][n];
			for (int i = 0; i < n; i++) {
				int days = sc.nextInt();
				for (int j = 0; j < days; j++) {
					int d = sc.nextInt();
					sche[d][i] = true;
				}
			}

			int[] group = new int[n];
			reschedule: for (int day = 1; day < sche.length; day++) {
				for (int j = 0; j < group.length; j++) {
					if (sche[day][j]) {
						if (group[j] != 0 && group[j] != day) {
							int g = group[j];
							for (int i = 0; i < group.length; i++) {
								if (group[i] == g) {
									group[i] = day;
								}
							}
						} else {
							group[j] = day;
						}

						for (int i = 0; i < group.length; i++) {
							if (group[i] != day) {
								break;
							}
							if (i == group.length - 1) {
								System.out.println(day);
								break reschedule;
							}
						}
					}
				}
				if (day == 30) {
					System.out.println(-1);
				}
			}

		}
	}
}