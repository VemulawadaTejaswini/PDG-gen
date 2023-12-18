import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int ans = 0;
		for (int i = 1; i < N1 + 1; i++) {
			for (int j = 22; j < N2 + 1; j++) {
				if (j % 10 < 2) {
					continue;
				}
				if (i == ((j / 10) * (j % 10))) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}