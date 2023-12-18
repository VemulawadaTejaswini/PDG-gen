import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int sum, getCoin, getBonus;
		int getSum = 0, count = 0;
		Scanner scan = new Scanner(System.in);

		getCoin = scan.nextInt();
		getBonus = scan.nextInt();
		sum = scan.nextInt();

		for(int i = 0; getSum < sum; i++) {
			count++;
		getSum += getCoin;
		if((count) % 7 == 0) {
			getSum += getBonus;
		}
	}
		System.out.println(count);
	}
}

