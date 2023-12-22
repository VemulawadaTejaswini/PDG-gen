import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[A];
		int min_a = Integer.MAX_VALUE;
		for(int i=0; i<A; i++) {
			a[i] = sc.nextInt();
			min_a = Math.min(min_a, a[i]);
		}

		int[] b = new int[B];
		int min_b = Integer.MAX_VALUE;
		for(int i=0; i<B; i++) {
			b[i] = sc.nextInt();
			min_b = Math.min(min_b, b[i]);
		}

		//最小値を先に計算
		int min = min_a + min_b;

		int ans = min;
		//割引券を使った時と比較
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();

			ans = Math.min(ans, a[x-1]+b[y-1]-c);
		}

		System.out.println(ans);
	}

}