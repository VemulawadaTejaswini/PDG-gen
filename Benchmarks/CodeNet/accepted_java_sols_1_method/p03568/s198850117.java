import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		// 偶数の項の数
		int M = 0;

		for(int i = 0; i<N; i++) {
			int a = in.nextInt();
			if(a % 2 == 0) {
				M++;
			}
		}

		int all_paterns_num = (int) Math.pow(3.0, (double) N);
		int all_kisu_num = (int) Math.pow(2.0, (double) M);

		System.out.println(all_paterns_num - all_kisu_num);
	}

}