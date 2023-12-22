import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力受け取り
		Scanner in = new Scanner(System.in);
		double N = in.nextDouble();
		double K = in.nextDouble();

		double y = 1;
		double sum = 0;

		// サイコロの目：１～Nで場合分け
		for ( int die = 1; die <= N; die++, y = 1.0 ) {

			// K以上になるまでコインを振る
			while ( die * y < K ) {
				y *= 2;
			}
			// 表が出続ける確率*サイコロのその目が出る確率
			sum += (1 / y) * (1 / N);
		}
		
		System.out.println(sum);
		in.close();
	}
}
