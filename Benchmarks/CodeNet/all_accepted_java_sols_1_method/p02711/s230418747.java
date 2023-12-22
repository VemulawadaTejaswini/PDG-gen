import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			System.out.println(s.contains("7") ? "Yes" : "No");
		}
	}

}