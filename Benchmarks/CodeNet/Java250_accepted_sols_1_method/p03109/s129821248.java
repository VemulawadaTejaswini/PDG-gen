import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		String a = date.replace("/", "");
		if (a.startsWith("0")) {
			a = a.replaceFirst("0", "");
		}

		if (20190430 >= Integer.parseInt(a)) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
