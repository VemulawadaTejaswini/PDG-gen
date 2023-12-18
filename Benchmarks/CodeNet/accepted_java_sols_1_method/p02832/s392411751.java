import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
//		long ans = 0;
		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
//		int k = sc.nextInt();
//		String s = sc.next();
//		String t = sc.next();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//

		int[] b = new int[n];
//		int[][] aa = new int[h][w];
//		int[] bb = new int[n];
//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
//			bb[i] = b[i];
		}
		int tmp = 1;

		for(int i=0; i < n; i++) {
			if(tmp != b[i]) {
				ans++;
			} else {
				tmp++;
			}
		}
		if(ans == n) {
			ans = -1;
		}

		System.out.println(ans);

		sc.close();
	}
}