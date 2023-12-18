import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] SW = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		if(SW[0] <= SW[1]) {
			System.out.print("un");
		}
		System.out.println("safe");
	}
}
