import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		final int NUM = 100000;
		final double r = 1.05;
		int ans = NUM;
		int n = scan.nextInt();
		// 計算
		for (int i = 0; i < n; i++) {
			ans *= r;
			ans = kiriage(ans);
		}
		// output
		System.out.println(ans);
	}
	
	static int kiriage(int n) {
		int k = 0,ans = 0;
		boolean ch = false;
		int[] tmp = new int[10000];
		// 1桁ごとに分解
		for (k = 0; n != 0; k++) {
			tmp[k] = n % 10;
			n /= 10;
		}
		// 桁上がりがあるかチェック
		for (int i = 0; i < 3; i++) {
			if(tmp[i] != 0) {
				ch = true;
				tmp[i] = 0;
			}
		}
		// 桁上がりあり
		if(ch) tmp[3]++;
		// それぞれ足す
		for (int i = 0; i < k; i++) ans += tmp[i]*Math.pow(10, i);
		
		return ans;
	}
}
