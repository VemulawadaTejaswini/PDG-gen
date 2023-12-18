import java.util.*;

public class Main {
	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = a*n;
		if (ans > b) {
			ans = b;
		}
		// 出力
		System.out.println(ans);

		sc.close();

	}
}