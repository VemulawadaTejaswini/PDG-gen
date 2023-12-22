import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[30];
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		for (int i = 3; i < 30; i++) {
			a[i] = a[i - 1] + a[i - 2] + a[i - 3];
		}
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int y = a[n - 1] / 3650 + 1;
			System.out.println(y);
		}
		sc.close();
	}
}