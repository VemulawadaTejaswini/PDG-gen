import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		while (n > 0) {
			boolean[][] exist = new boolean[n][30];
			String[] name = new String[n];
			for (int i = 0; i < n; ++i) {
				name[i] = sc.next();
				int m = sc.nextInt();
				for (int j = 0; j < m; ++j) {
					int time = sc.nextInt();
					exist[i][time] = true;
				}
			}
			int[] point = new int[n];
			for (int i = 0; i < 30; ++i) {
				int count = 0;
				for (int j = 0; j < n; ++j) {
					if (exist[j][i]) ++count;
				}
				for (int j = 0; j < n; ++j) {
					if (exist[j][i]) point[j] += (n - count + 1);
				}
			}
			int min = Integer.MAX_VALUE;
			String minName = "";
			for (int i = 0; i < n; ++i) {
				if (point[i] < min || point[i] == min && name[i].compareTo(minName) < 0) {
					min = point[i];
					minName = name[i];
				}
			}
			System.out.println(min + " " + minName);
			n = sc.nextInt();
		}
	}

}