import java.util.*;

public class Main {
	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		
		// 数値
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		int ans = 0;
		if (a+b >= x && a <= x) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}