import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			if ((n | q) == 0)
				break;
			int[] cd = new int[101];
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				for (int j = 0; j < m; j++) {
					cd[sc.nextInt()]++;
				}
			}
			int max = 0;
			int ans = 0;
			for (int i = 0; i < 101; i++) {
				if (cd[i] >= q && max < cd[i]) {
					max = cd[i];
					ans = i;
				}
			}
			System.out.println(ans);
		}
	}
}