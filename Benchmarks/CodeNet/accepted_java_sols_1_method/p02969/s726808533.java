import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, ans;
		n = in.nextInt();
		ans = 3 * n * n;
		System.out.println(ans);
		in.close();
	}
}
