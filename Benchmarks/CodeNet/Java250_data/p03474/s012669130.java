import java.util.Scanner;

public class Main {

public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();

			String regex = "^[0-9]{%d}-[0-9]{%d}$";
			regex = String.format(regex, a, b);

			if (s.matches(regex)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

			sc.close();
		}
}