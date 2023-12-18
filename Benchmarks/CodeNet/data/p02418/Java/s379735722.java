import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String p = scanner.nextLine();
		s = s + s;
		if (s.contains(p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();
	}

}

