
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int max = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		ans = a + b + c;
		max = Math.max(a, Math.max(b, c));
		ans -= max;
		int k = sc.nextInt();
		for(int i = 0; i < k; i++) {
			max *= 2;
		}
		ans += max;
		System.out.println(ans);
	}

}
