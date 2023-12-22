import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long ans = 0;

		Scanner sc = new Scanner(System.in);
		int  m = sc.nextInt();
		int  d = sc.nextInt();
//		longd = sc.nextInt();
//
//		boolean f = false;
//		int[] array = new int [n+1];
//		int[] array2 = new int[n];
//		for (int i = 0; i < n+1; i++) {
//			array[i] = sc.nextInt();
//		}
//		for (int i = 0; i < n; i++) {
//			array2[i] = sc.nextInt();
//		}


		for(int i = 1; i <= m; i++) {
			if(i < 4) {
				continue;
			}
			for(int j = 1; j <= d; j++) {
				int d10 = j/10;
				int d1 = j%10;
				if(d10 < 2 || d1 < 2) {
					continue;
				}
				if(d10 * d1 == i) {
					ans++;
				}
			}
		}


		System.out.println(ans);

		sc.close();
	}
}