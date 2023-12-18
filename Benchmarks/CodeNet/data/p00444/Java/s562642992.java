import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

			while (sc.hasNext()) {
				int price = sc.nextInt();
					if (price == 0) break;
					
				System.out.println(CountChange(1000 - price));
			}


	}

	public static int CountChange(int p) {
		int[] coins = {500, 100, 50, 10, 5, 1};
		int cntcng = 0;
		
			for (int c : coins) {
				cntcng += p / c;
				p %= c;
			}

		return cntcng;

	}

}

