import java.util.Scanner;

// https://atcoder.jp/contests/abc135/tasks/abc135_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int A = Math.min(a, b);
		int B = Math.max(a, b);

		if((A+B)%2==0) {
			int K = (A+B)/2;

			if((A-K)<=0 && (B-K)>=0) {
				System.out.println(K);
			} else {
				System.out.println("IMPOSSIBLE");
			}
		} else {
			System.out.println("IMPOSSIBLE");
		}





	}

}
