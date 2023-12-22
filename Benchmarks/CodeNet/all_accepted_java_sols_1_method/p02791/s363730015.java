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

		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];

		int[] a = new int[n];
//		int[] b = new int[n];
//		long[] a = new long[n];
//		long[] b = new long[n];
//		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			a[i]= sc.nextInt();
		}

//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}


//		for(int i = 0; i < n; i++) {
//			f = false;
//			for(int j = 0; j < i; j++) {
//				if(a[i] <= a[j]) {
//					f = true;
////					System.err.println(a[i] +" "+ a[j]);
//				} else {
//					f = false;
//					break;
//				}
//			}
//			if(f) {
//				ans++;
//			}
//		}

		int tmp = n+1;
		for(int i = 0; i < n; i++) {
			if(i==0) {
				tmp = a[i];
				continue;
			}
			if(tmp >= a[i]) {
				tmp = a[i];
				ans++;
			}

		}

		ans++;




		System.out.println(ans);

		sc.close();
	}


}