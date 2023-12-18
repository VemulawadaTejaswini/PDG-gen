import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int[] coins = new int[] {500, 100, 50, 10, 5, 1};
		while(true) {
			int money = 1000 - sc.nextInt();
			if(money == 1000) break;
			int ans = 0;
			while(money > 0) {
				for(int k : coins) {
					if(money >= k) {
						money -= k;
						ans++;
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}
}