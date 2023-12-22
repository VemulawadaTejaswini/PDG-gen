import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double f_ans = 0;

		for (int i=1; i<N+1; i++) {
			double point = i;
			double cnt=0;

			while (true) {
				if (point>=K) {
					break;
				}
				point *= 2;
				cnt += 1;
			}
			double per = 1/Math.pow(2,cnt);
			f_ans += per;
		}


		double ans = f_ans/N;
		System.out.println(ans);


	}

}