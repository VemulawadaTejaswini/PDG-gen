import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			if (n <= 999) {
				System.out.println("ABC");
			} else {
				System.out.println("ABD");
			}
		}

	}

}