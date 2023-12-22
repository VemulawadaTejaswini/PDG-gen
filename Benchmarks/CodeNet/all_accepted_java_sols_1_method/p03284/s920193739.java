import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// N = 枚数,K = 人数
		int N = sc.nextInt();
		int K = sc.nextInt();

		Boolean ans = false;

		if(N % K == 0) {
			ans = true;
		}

		System.out.println(ans? 0 : 1);

		sc.close();
	}

}
