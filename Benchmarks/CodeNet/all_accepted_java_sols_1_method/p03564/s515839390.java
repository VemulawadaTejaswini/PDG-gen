import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int n =1;

		for (int i=0; i<N; i++) {
			if (n*2<n+K) {
				n = n*2;
			} else {
				n = n+K;
			}
		}
		System.out.println(n);

	}

}
