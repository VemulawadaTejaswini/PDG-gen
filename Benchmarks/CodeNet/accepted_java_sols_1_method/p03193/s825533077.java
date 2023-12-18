import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a, b, cnt = 0;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a >= h && b >= w) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}