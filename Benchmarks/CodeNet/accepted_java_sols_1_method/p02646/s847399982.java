import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		sc.close();

		if (w >= v) {
			System.out.println("NO");
			return;
		}

		int d = Math.abs(a - b);
		if ((long) (v - w) * t >= d) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
