import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int t = 0;
			int it = i;
			for (;it / 10 > 0; it /= 10) {
				t += it % 10;
			}
			t += it;
			if (a <= t && t <= b)
				sum += i;
		}
		System.out.println(sum);
	}
}