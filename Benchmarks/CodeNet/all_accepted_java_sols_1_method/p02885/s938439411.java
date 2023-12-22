import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			String[] input = scanner.nextLine().split(" ");
			int a = Integer.valueOf(input[0]);
			int b = Integer.valueOf(input[1]);

			System.out.println((a>2*b)? a-2*b : 0);
		}
	}

}
