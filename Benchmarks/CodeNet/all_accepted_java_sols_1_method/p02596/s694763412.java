import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		// System.out.println("k: " + k);
		int ans = -1;
		int cur = 0;
		for (int i = 1; i <= 1e7; i++) {
			cur = (cur * 10 + 7) % k;
			if (cur == 0) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}






