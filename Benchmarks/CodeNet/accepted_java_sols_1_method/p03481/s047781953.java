import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		long X, Y;

		X = in.nextLong();
		Y = in.nextLong();

		int ans = 0;
		long X_i = X;
		while(X_i <= Y) {
			ans++;
			X_i *= 2;
		}

		System.out.println(ans);

	}

}
