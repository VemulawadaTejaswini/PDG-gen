import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r[] = new int[n];
		int maxv = -999999999;
		for (int i = 0; i < r.length; i++) {
			r[i] = sc.nextInt();
		}
		int minv = r[0];
		for (int i = 1; i < n; i++) {
			maxv = r[i] - minv > maxv ? r[i] - minv : maxv;
			minv = minv > r[i] ? r[i] : minv;
		}
		System.out.println(maxv);
	}
}

