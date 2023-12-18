import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		long answer = 0;

		long l_num_befbef = -1;
		long l_num_bef    = 2;
		long now_num = 0;

		for(int i = 0; i < N; i++) {
			now_num = l_num_bef + l_num_befbef;
			l_num_befbef = l_num_bef;
			l_num_bef = now_num;

			answer = now_num;
		}

		System.out.println(answer);
	}

}
