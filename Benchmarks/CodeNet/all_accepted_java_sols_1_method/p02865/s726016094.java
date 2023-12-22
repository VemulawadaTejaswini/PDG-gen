import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
//		long ans = 0;

		Scanner sc = new Scanner(System.in);
//		long  a = sc.nextLong();
//		long  b = sc.nextLong();

//		int  k = sc.nextInt();
//		long d = sc.nextLong();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		boolean f = true;
//
//		int[] aa = new int[n];
//		int[] b = new int[n];
//		for (int i = 0; i < n; i++) {
//			aa[i] = sc.nextInt();
//			b[i] = 0;
//		}
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


		int n = sc.nextInt();
		int ans = 0;

		if(n == 1){
			ans = 0;
		} else if(n % 2 == 0) {
			ans = (n/2)-1;
		} else if(n % 2 == 1){
			ans = n/2;
		}

		System.out.println(ans);


		sc.close();
	}
}