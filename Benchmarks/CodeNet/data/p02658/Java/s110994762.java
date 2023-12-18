import java.util.ArrayList;
import java.util.Scanner;
// A - Multiplication 1
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt(); //

		//long ans = sc.nextLong();
		long ans = 0;
		long x = 0;
		long v = Long.valueOf("1000000000000000000");

		boolean exFlg = false;

		ArrayList<Long> lstA;
		lstA = new ArrayList<Long>();

		for (int i=0; i < N; i++) {
			x = sc.nextLong();
			// 0掛けしていれば終わり
			if (x == 0) {
				ans = 0;
				exFlg = true;
				break;
			}
			lstA.add(x);
		}

		if (!exFlg) {
			ans = lstA.get(0);
			for (int i=1; i < N; i++) {

				ans= ans * lstA.get(i);

			}

			if (ans > v) {
				ans = -1;
			}
		}
		System.out.println(ans);
	}
}