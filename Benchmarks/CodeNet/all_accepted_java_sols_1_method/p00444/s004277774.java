import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int money = sc.nextInt();
			
			if(money == 0){
				break;
			}
			
			money = 1000 - money;
			
			int[] coins = { 500, 100, 50, 10, 5, 1 };

			int count = 0;
			for (int coin : coins) {
				int m = money / coin;
				count += m;
				money -= coin * m;
			}

			System.out.println(count);
		}
	}

}