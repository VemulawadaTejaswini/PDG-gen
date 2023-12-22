import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] temp = s.split("/");

		int year = Integer.parseInt(temp[0]);
		int month;
		if (temp[1].charAt(0) == '0') {
			month = Integer.parseInt(temp[1].substring(1));
		} else {
			month = Integer.parseInt(temp[1]);
		}
		int date;
		if (temp[2].charAt(0) == '0') {
			date = Integer.parseInt(temp[2].substring(1));
		} else {
			date = Integer.parseInt((temp[2]));
		}

		if (year < 2019) {
			System.out.println("Heisei");
		} else {
			if (month < 4) {
				System.out.println("Heisei");
			} else if (month == 4) {
				if (date <= 30) {
					System.out.println("Heisei");
				} else {
					System.out.println("TBD");
				}
			} else {
				System.out.println("TBD");
			}
		}
	}
}