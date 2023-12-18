import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		System.out.println(s.replace("2017", "2018"));

	}

}
