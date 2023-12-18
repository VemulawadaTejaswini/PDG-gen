import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		final int K = Integer.parseInt(sc.next());
		int ans;
		if(K > 1) {
			ans = N - K;
		} else {
			ans = 0;
		}

		System.out.println(ans);
	}

}
