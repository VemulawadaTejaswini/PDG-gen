import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int nuku = 0;
		if (l >= 0) {
			nuku = 0;
		} else if (l < 0 && l + n - 1 > 0) {
			nuku = -1;
		} else {
			nuku = n - 1;
		}
		int ret = 0;
		for (int i = 1; i <= n; i++) {
			if (i == nuku + 1) {
				continue;
			}
			ret += l + i - 1;
		}
		System.out.println(ret);
	}
}
