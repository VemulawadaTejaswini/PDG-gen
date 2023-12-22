import java.util.Scanner;

public class Main {

	public static int N;
	public static int K;

	public static void main(String[] args) {
		init();
		int ans = 0;
		while (N > 0) {
			ans++;
			N /= K;
		}
		System.out.println(ans);
	}

	public static void init() {
		Scanner sc = new Scanner(System.in);
		try {
			N = sc.nextInt();
			K = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
