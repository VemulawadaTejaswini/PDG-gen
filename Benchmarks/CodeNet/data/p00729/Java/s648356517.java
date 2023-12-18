import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int pc = sc.nextInt();
			int n = sc.nextInt();
			if (pc == 0 && n == 0) return;
			int r = sc.nextInt();

			int time[][] = new int [n+1][1260+1];
			for (int i = 0; i < r; i++) {
				int t = sc.nextInt();
				int pcn = sc.nextInt();
				int m = sc.nextInt();
				int s = sc.nextInt();
				if (s == 1) time[m][t]++;
				if (s == 0) time[m][t]--;
			}

			for (int k = 1; k <= n; k++)
				for (int i = 540; i <= 1260; i++)
					time[k][i] += time[k][i-1];

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int ts = sc.nextInt();
				int tg = sc.nextInt();
				int m = sc.nextInt();
				int count = 0;
				for (int j = ts; j < tg; j++) {
					if (time[m][j] > 0) count++;
				}
				System.out.println(count);
			}
		}
	}
}

