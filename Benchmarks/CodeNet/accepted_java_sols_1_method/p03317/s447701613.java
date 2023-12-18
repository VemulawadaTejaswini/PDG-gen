import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int N_ = N - K;
		int K_ = K - 1;
		int X = N_ / K_;
		String ZZ = sc.nextLine();
		if(N_ % K_ == 0) {
			System.out.println(X + 1);
		}else {
			System.out.println(X + 2);
		}
	}

}