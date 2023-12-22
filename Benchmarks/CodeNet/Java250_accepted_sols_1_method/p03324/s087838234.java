import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		int ok = (int) Math.pow(100, d);
		int ng = (int) Math.pow(100, d + 1);
		int cnt = 0;
		for (int i = 0; i < 2000000; i+=ok) {
			if (i % ng != 0) {
				cnt++;
			}
			if (cnt == n) {
				System.out.println(i);
				return;
			}
		}
	}
}
