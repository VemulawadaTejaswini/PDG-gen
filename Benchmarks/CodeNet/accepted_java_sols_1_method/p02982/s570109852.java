import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int[][] x = new int[n][d];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = Integer.parseInt(sc.next());
			}
		}
		int ans = 0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				int tmp = 0;
				double distance = 0;
				for (int j2 = 0; j2 < x[i].length; j2++) {
					tmp += Math.pow(x[i][j2] - x[j][j2], 2);
				}
				distance = Math.sqrt(tmp);
				if ((distance - (int) distance) == 0.0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}