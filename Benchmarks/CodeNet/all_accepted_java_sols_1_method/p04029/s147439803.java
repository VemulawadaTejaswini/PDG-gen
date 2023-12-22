import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int min = 1;
			int max = scanner.nextInt();

			System.out.println((int)((min+max)*((double)max/2)));
		}
	}
}
