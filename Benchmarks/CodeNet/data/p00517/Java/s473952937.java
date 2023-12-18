import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();

		int H = sc.nextInt();

		int N = sc.nextInt();

		int[] X = new int[N];

		int[] Y = new int[N];

		int ans = 0;

		for(int i=0;i<N;i++) {

			X[i] = sc.nextInt();

			Y[i] = sc.nextInt();
		}

		int x0 = X[0];

		int y0 = Y[0];

		int x1, y1;

		for(int i=1;i<N;i++) {

			x1 = X[i];

			y1 = Y[i];

			if(x0==x1) {

				ans += Math.abs(y0-y1);

				x0 = x1;

				y0 = y1;

			}else if(y0==y1) {

				ans += Math.abs(x0-x1);

				x0 = x1;

				y0 = y1;

			}else if(x0-x1 == y0-y1) {

				ans += Math.abs(x0-x1);

				x0 = x1;

				y0 = y1;

			}else {

				ans += Math.abs(x0-x1);

				ans += Math.abs(y0-y1);

				if(y1<y0) {

					ans -= Math.abs(y0-y1);
				}

				x0 = x1;

				y0 = y1;
			}

		}

		System.out.println(ans);
	}

}

