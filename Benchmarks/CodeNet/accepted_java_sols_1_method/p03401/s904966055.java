import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n + 2];
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int[] b = new int[n + 2];
		for (int i = 1; i <= n + 1; i++) {
			b[i] = Math.abs(a[i] - a[i - 1]) + b[i - 1];
		}
		for (int i = 1; i <= n; i++) {
			int c = Math.abs(a[i - 1] - a[i + 1]);
			System.out.println(b[n + 1] - Math.abs(a[i + 1] - a[i]) - Math.abs(a[i] - a[i - 1]) + c);
		}
	}
}