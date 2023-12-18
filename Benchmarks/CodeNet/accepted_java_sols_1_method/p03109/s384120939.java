import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		final String s = sc.nextLine();
		final String[] split = s.split("/");
		
		final int y = Integer.parseInt(split[0]);
		final int m = Integer.parseInt(split[1]);
		final int d = Integer.parseInt(split[2]);
		
		if (y < 2019) {
			System.out.println("Heisei");
		} else if (y > 2019) {
			System.out.println("TBD");
		} else {
			if (m <= 4) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}
		}
	}

}