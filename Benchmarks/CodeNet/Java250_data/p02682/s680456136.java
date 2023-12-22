import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int[] s  = {0,0,0,0};
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		int full = 0;

		if(a == k) {
			full = a;
		}else if(a > k) {
			full = k;
		}else {
			full = a;
			if(b <= k-a) {
				full -= k-a-b;
			}
		}
		System.out.println(full);

	}

}
