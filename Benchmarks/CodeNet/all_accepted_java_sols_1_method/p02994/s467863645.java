

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());

		int ans = 0;
//		(N + L -1) < 0ならすべて負の値→最大の値
//		L > 0 ならすべて正の値→最小の値
		if((N+L-1) < 0) {//all number minus
//			数列的に考えたい → O(1)のはず
			ans = (L + (N  + L - 1)) * N / 2 - (N  + L - 1);
		}else if(L > 0) {//all number plus
			ans = (L + (N + L - 1)) * N / 2 - L;
		}else {
			ans = (L + (N + L - 1)) * N / 2;
		}

		System.out.println(ans);
	}

}
