import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long ans = 1;
		for (int i = 0; i < N; i++) {
			long A = scan.nextLong();
			ans = ans * A;
		}
		if (ans >(long) Math.pow(10, 18)) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

	}


}
