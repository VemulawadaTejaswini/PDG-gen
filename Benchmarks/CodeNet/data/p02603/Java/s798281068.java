import java.util.Scanner;

public class Main {

	static int time = 0;

	static int limit = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		limit = n;
		int[] stock = new int[n];

		for (int i = 0; i < n; i++) {
			stock[i] = sc.nextInt();
		}
		sc.close();
		int money = 1000;
		while (time < n - 1) {
			money = stockTrade(money, stock);
		}
		print(money);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static int stockTrade(int money, int[] stock) {
		while (stock[time] >= stock[time + 1]) {
			time++;
			if (time == limit - 1) {
				return money;
			}
		}
		int stockNum = money / stock[time];
		int residue = money - stockNum * stock[time];
		while (stock[time] <= stock[time + 1]) {
			time++;
			if (time == limit - 1) {
				return residue + stockNum * stock[time];
			}
		}
		return residue + stockNum * stock[time];
	}

}