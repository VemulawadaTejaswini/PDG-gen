import java.util.Arrays;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

//		long ans = 0;
//		double ans = 0.0;
		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


//		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];

		int[] a = new int[A];
		int[] b = new int[B];
		int[] x = new int[M];
		int[] y = new int[M];
		int[] c = new int[M];
//		long[] a = new long[n];
//		long[] b = new long[n];
//		int[][] a = new int[n][m];

//		ArrayList<Long> list = new ArrayList<>();

		for (int i = 0; i < A; i++) {
			a[i]= sc.nextInt();
		}
		for (int i = 0; i < B; i++) {
			b[i]= sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			x[i]= sc.nextInt();
			y[i]= sc.nextInt();
			c[i]= sc.nextInt();
		}

//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		ans = 1000000;
		for(int i = 0; i < M; i++) {
			int tmp = a[x[i]-1] + b[y[i]-1] - c[i];
			if(tmp <= ans) {
				ans = tmp;
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		if(ans > a[0]+b[0]) {
			ans = a[0]+b[0];
		}

		System.out.println(ans);

		sc.close();
	}
}