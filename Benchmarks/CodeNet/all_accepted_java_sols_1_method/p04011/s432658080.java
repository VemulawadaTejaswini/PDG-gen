import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ret = 0;
		for (int i = 1; i <= n; i++) {
			if (i > k) {
				ret += y;
			} else {
				ret += x;
			}
		}
		System.out.println(ret);
	}

}
