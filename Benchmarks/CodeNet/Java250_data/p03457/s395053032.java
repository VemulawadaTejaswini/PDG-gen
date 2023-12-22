import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String ans = "Yes";
		for (int i = 0; i < N; i++) {
			int t = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			if (t < x + y || ((t % 2 == 0) != ((x + y) % 2 == 0))) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
		in.close();
	}
}