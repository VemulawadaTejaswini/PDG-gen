import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// すべてのa[i]に含まれる約数2の数を調べればいい
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			while (a[i]%2 == 0) { //2で割り続け、奇数になったらループを抜ける
				a[i] /= 2;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
