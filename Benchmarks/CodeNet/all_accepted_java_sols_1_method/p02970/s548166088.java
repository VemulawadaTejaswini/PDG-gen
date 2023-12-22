import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());

		int treePerP = 2 * D + 1;

		int ans = N / treePerP;
		if (N % treePerP > 0) {
			ans += 1;
		}

		System.out.println(ans);

	}

}
