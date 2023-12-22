import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
		int ans = 0;

		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
//		int  k = sc.nextInt();

//		int  k = sc.nextInt();
//		long d = sc.nextLong();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		boolean f = true;
//
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = 0;
		}
//		for (int i = 0; i < k; i++) {
//			b[i] = sc.nextInt();
//		}
//		for (int i = 1; i <n; i++) {
//			b[i] = sc.nextInt();
//		}
//		int[][] c = new int[h][w];
//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				c[i][j] = 0;
//			}
//		}

//		int tmp_a = 0;
//		int tmp_b = 0;
		int cnt=1;


		fool : for(int i = 0;i<n;i++) {
			b[a[i]-1] = i+1;
		}

		for(int i:b)
			System.out.println(i);

		sc.close();
	}
}