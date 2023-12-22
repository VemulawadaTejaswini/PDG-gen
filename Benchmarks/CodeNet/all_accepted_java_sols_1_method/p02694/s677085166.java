import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long i = sc.nextLong();
		long money = 100;
		int count = 0;

		while (money < i) {
			money += money * 0.01;
			count++;
		}

		System.out.println(count);

	}

}