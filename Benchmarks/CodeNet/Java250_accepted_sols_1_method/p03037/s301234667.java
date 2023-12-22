import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l[] = new int[m];
		int r[] = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		Arrays.sort(l);
		Arrays.sort(r);
		if (r[0] - l[m-1] < 0) {
			System.out.println(0);
			return;
		}
		System.out.println(r[0] - l[m-1] + 1);
	}
}