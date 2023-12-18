import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char[][] c = new char[H][W];
		for (int i=0;i<H;i++) {
			String S = sc.next();
			for (int j=0;j<W;j++) {
				c[i][j] = S.charAt(j);
			}
		}

		int ans = 0;
		for (int i=0;i<(1<<(H+W));i++) {
			int[] arr = new int[H+W];
			int tmp = i;
			for (int j=0;j<H+W;j++) {
				arr[j] = tmp%2;
				tmp/=2;
			}

			int black_cnt = 0;
			for (int j=0;j<H;j++) {
				for (int k=0;k<W;k++) {
					if (arr[j]==1 || arr[H+k]==1) continue;
					if (c[j][k]=='#') black_cnt++;
				}
			}
			if (black_cnt==K) ans++;
			// System.out.println(Arrays.toString(arr));
		}
		System.out.println(ans);
	}
}