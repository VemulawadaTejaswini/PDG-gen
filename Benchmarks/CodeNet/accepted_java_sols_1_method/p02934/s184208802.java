import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] A = new double[N];

		double ans = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			A[i] = 1 / A[i];
			ans += A[i];
		}
		ans = 1/ans;

		/*		for(int i = 0; i < N; i++){
					ans = 1 / ans;
				}
		*/
		System.out.println(ans);

	}

}