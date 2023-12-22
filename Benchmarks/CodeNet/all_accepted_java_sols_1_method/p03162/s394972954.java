import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}

		int dpA[] = new int[n];
		int dpB[] = new int[n];
		int dpC[] = new int[n];
		dpA[0] = a[0];
		dpB[0] = b[0];
		dpC[0] = c[0];

		for ( int i = 1; i < n; i++ ) {
			dpA[i] = a[i] + Math.max(dpB[i - 1], dpC[i - 1]);
			dpB[i] = b[i] + Math.max(dpA[i - 1], dpC[i - 1]);
			dpC[i] = c[i] + Math.max(dpB[i - 1], dpA[i - 1]);
		}

		System.out.println(Math.max(dpA[n - 1], Math.max(dpB[n - 1], dpC[n - 1])));
		in.close();
	}
}