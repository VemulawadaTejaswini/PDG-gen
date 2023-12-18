import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		if (str.contains("A") && str.contains("B")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
