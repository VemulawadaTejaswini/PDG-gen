import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String date = sc.next();
			int year = Integer.valueOf(date.substring(0, 4)).intValue();
			int month = Integer.valueOf(date.substring(5, 7)).intValue();
			int day = Integer.valueOf(date.substring(8, 9)).intValue();

			int kjdatenum = 2019 * 10000 + 4 * 100 + 30;
			if (kjdatenum >= (year * 10000 + month * 100 + day)) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}
		}
	}
}