import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int team[];
		int ranking[];
		int rankNumber;
		int max;
		int count;

		n = sc.nextInt();
		team = new int[n];
		ranking = new int[n];
		rankNumber = 1;
		max = 0;
		count = 0;

		for (int i = 0; i < n * (n - 1) / 2; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			int m = sc.nextInt();
			if (m < l) {
				team[j - 1] += 3;
			} else if (l == m) {
				team[j - 1] += 1;
				team[k - 1] += 1;
			} else {
				team[k - 1] += 3;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (max < team[j]) {
					max = team[j];
				}
			}
			for (int j = 0; j < n; j++) {
				if (team[j] == max) {
					ranking[j] = rankNumber;
					team[j] = -1;
					count++;
				}
			}
			rankNumber += count;
			count = 0;
			max = 0;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(ranking[i]);
		}
	}
}