import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m1 = in.nextInt();
		int d1 = in.nextInt();
		int m2 = in.nextInt();
		int d2 = in.nextInt();
		int ans;
		if (m1 < m2 || d1 > d2) {
			ans = 1;
		} else {
			ans = 0;
		}
		System.out.println(ans);
	}

}
