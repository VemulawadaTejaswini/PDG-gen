import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 22; j <= d; j++) {
				if (j / 10 >= 2 && j % 10 >= 2 && i == (j / 10) * (j % 10)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}