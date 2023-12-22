import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W[] = new int[2];
		int H[] = new int[2];

		W[0] = 0;
		W[1] = sc.nextInt();
		H[0] = 0;
		H[1] = sc.nextInt();


		int N = sc.nextInt();

		int x[] = new int[N];
		int y[] = new int[N];
		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {

			if (a[i]==1) {
				if (W[0] < x[i]) {
					W[0] = x[i];
				}
			}
			if (a[i]==2) {
				if(W[1] > x[i]) {
					W[1] = x[i];
				}
			}
			if (a[i]==3) {
				if (H[0] < y[i]) {
					H[0] = y[i];
				}
			}
			if (a[i]==4) {
				if (H[1] > y[i]) {
					H[1] = y[i];
				}
			}
		}

		int S = 0;

		if (W[1] > W[0] && H[1] > H[0]) {
			S = (W[1]-W[0])*(H[1]-H[0]);
		}
		System.out.println(S);
	}
}
