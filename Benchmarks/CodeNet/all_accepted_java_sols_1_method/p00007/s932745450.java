import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money = 100000; //貸付額
		int n = sc.nextInt(); //n週間

		for (int i = 0; i < n; i++) {
			money = money * 1.05;
			money =((Math.ceil(money/1000))*1000);
		}
		System.out.println((int)money);

	}
}

