import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		while(sc.hasNext()) {
			int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int ans = 0;
			for(int i = 0; i < 10; i++) {
				if(cards[i] == a || cards[i] == b || cards[i] == c) {
					continue;
				}
				if(20 - (a + b + cards[i]) >= 0) ans++;
			}
			System.out.println((ans / 7.0 >= 0.5) ? "YES" : "NO");
		}
	}
}