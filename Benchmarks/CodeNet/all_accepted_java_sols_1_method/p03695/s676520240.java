import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), a, ans = 0, tmp[] = new int[9];
		for (int i = 0; i < N; ++i) {
			a = sc.nextInt();
			if (a >= 3200) ++tmp[8];
			else ++tmp[a / 400];
		}
		sc.close();
		for (int i = 0; i < 8; ++i) {
			if (tmp[i] > 0) ++ans;
		}
		if (ans == 0) System.out.print(1);
		else System.out.print(ans);
		System.out.print(" " + (ans + tmp[8]));
	}
}