import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			String[] arr = data.split(" ");
			int n = Integer.parseInt(arr[0]);
			int x = Integer.parseInt(arr[1]);
			int t = Integer.parseInt(arr[2]);

			int index = 0;
			int res = n;
			while(res > 0) {
				res = res - x;
				index++;
			}

			System.out.println(index * t);
		}
	}
}
