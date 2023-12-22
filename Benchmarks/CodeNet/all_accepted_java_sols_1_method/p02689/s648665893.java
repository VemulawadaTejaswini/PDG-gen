import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//展望台の数
		int m = sc.nextInt();//道の数
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();//それぞれの展望台の高さ。
		}
		int[] b = new int[n];//標高が低かった回数を格納→0のものがいい展望台。
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			if (a[x] < a[y]) {
				b[x]++;//低かった方でカウントする
			} else if (a[x] > a[y]) {
				b[y]++;
			} else {
				b[x]++;
				b[y]++;
			}

		}
		int cnt = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}