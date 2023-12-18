import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int fromL[], fromR[];
		int a[];
		int idL, idR;
		int max;

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			fromL = new int[n];
			fromR = new int[m];
			a = new int[n + m];
			for (int i = 0; i < n; i++) {
				fromL[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				fromR[i] = sc.nextInt();
			}
			idL = idR = 0;
			for (int i = 0; i < n + m; i++) {
				if (idL < n && fromL[idL] < fromR[idR]) {
					a[i] = fromL[idL];
					idL++;
				} else {
					a[i] = fromR[idR];
					idR++;
				}
			}
			max = a[0];
			for (int i = 1; i < n + m; i++) {
				max = Math.max(max, a[i] - a[i - 1]);
			}
			
			System.out.println(max);
		}
	}
}