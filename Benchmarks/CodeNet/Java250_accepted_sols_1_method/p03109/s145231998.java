import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner bui = new Scanner(System.in);
		String s = bui.next();

		String[] year = s.split("/");
		if(Integer.parseInt(year[0]) < 2019 ) {
			System.out.println("Heisei");
		} else if(Integer.parseInt(year[0]) > 2019) {
			System.out.println("TBD");
		} else if(Integer.parseInt(year[1]) <= 4) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
