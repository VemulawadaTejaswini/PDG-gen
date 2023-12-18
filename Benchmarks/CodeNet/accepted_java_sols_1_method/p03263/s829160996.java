import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		String space = " ";
		List<String> ans = new ArrayList<String>(h * w);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w - 1; j++) {
				if (a[i][j] % 2 == 1) {
					a[i][j]--;
					a[i][j + 1]++;
					StringBuilder sb = new StringBuilder();
					sb.append(i + 1).append(space).append(j + 1).append(space)
						.append(i + 1).append(space).append(j + 2);
					ans.add(sb.toString());
				}
			}
		}
		for (int i = 0; i < h - 1; i++) {
			if (a[i][w - 1] % 2 == 1) {
				a[i][w - 1]--;
				a[i + 1][w - 1]++;
				StringBuilder sb = new StringBuilder();
				sb.append(i + 1).append(space).append(w).append(space)
					.append(i + 2).append(space).append(w);
				ans.add(sb.toString());
			}
		}
		System.out.println(ans.size());
		for (String s : ans) {
			System.out.println(s);
		}
	}
}
