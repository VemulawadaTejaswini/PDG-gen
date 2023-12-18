import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			String[] arr = data.split(" ");
			int d = Integer.parseInt(arr[0]);
			int t = Integer.parseInt(arr[1]);
			int s = Integer.parseInt(arr[2]);

			System.out.println((s * t) >= d ? "Yes" : "No");
		}
	}
}
