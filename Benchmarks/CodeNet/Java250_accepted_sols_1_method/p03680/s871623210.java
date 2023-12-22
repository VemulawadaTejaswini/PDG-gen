import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), a[][] = new int[N][2], ans = 0, tmp = 0;
		for (int i = 0; i < N; ++i) a[i][0] = sc.nextInt();
		sc.close();
		for (int i = 0; a[i][0] != 2; ++ans) {
			if (a[i][1] == 1) {
				tmp = 1;
				break;
			}
			a[i][1] = 1;
			i = a[i][0] - 1;
		}
		if (tmp == 0) System.out.print(ans + 1);
		else System.out.print(-1);
	}
}