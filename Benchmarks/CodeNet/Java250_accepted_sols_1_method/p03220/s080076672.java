import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double T = sc.nextDouble();

		double A = sc.nextDouble();

		double[] H = new double[N];

		for(int i=0;i<N;i++) H[i] = sc.nextDouble();

		double h = T - (H[0]*0.006);

		int ans = 1;

		for(int i=1;i<N;i++) {

			double hi = T - (H[i]*0.006);

			if(Math.abs(A-h)>Math.abs(A-hi)) {

				h = hi;

				ans = i+1;

			}
		}

		System.out.println(ans);
	}

}
