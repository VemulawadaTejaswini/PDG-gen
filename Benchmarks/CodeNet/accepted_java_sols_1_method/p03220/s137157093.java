import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

				Scanner sc = new Scanner(System.in);

				int N = sc.nextInt();
				double T = sc.nextDouble();
				double A = sc.nextDouble();
				double[] H = new double[N];
				double sa = 99999999.9;
				int ans = 0;

				for(int i = 0; i < N; i++) {
					H[i] = sc.nextDouble();
				}

				for(int i = 0; i < N; i++) {
					double tmp = T - H[i]*0.006;
					double abs = Math.abs(A - tmp);
					if(abs<sa) {
						ans = i+1;
						sa = abs;
					}
				}

				System.out.println(ans);

	}

}