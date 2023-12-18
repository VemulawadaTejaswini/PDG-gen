import java.util.Scanner;

// https://atcoder.jp/contests/abc145/tasks/abc145_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		if(N%2==0) {
			String str = S.substring(0, N/2);
			if(str.contentEquals(S.substring(N/2,N))) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}

	}
}
