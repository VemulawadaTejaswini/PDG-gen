import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

		static int[] mx = {1, 0, -1, 0};
		static int[] my = {1, 0, -1, 0};
		static int h;
		static int w;
		static char[][] map;

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			String[] temp = scanner.nextLine().split(" ");
			int n  = Integer.parseInt(temp[0]);
			int m  = Integer.parseInt(temp[1]);

			String[] t = scanner.nextLine().split(" ");
			int[] sum  = new int[n];
			int[] lst  = new int[n];

			lst[0] = Integer.parseInt(t[0]);
			sum[0] = lst[0];
			for(int i = 1; i < n; i++) {

				lst[i] = Integer.parseInt(t[i]);
				sum[i] = lst[i] + sum[i - 1];
			}

			int max = 0;
			int num = 0;
			for(int i = 0; i < n - m; i++) {

				int te = sum[i + m] - sum[i];
				if(max < te) {
					max = te;
					num = i + 1;
				}
			}


			double ans = 0;

			for(int i = num; i < num + m; i ++) {

				for(int j = 1; j <= lst[i]; j++) {

					ans += ((double)j) / lst[i];
				}
			}

			System.out.println(ans);
		}
	}
