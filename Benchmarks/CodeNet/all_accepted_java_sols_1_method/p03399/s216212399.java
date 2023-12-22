import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int price1 = sc.nextInt();
		int allYouDoPrice1 = sc.nextInt();
		int price2 = sc.nextInt();
		int allYouDoPrice2 = sc.nextInt();

		int total = 0;
		if (price1 < allYouDoPrice1) {
			total += price1;
		} else {
			total += allYouDoPrice1;
		}

		if (price2 < allYouDoPrice2) {
			total += price2;
		} else {
			total += allYouDoPrice2;
		}

		System.out.println(total);
	}
}