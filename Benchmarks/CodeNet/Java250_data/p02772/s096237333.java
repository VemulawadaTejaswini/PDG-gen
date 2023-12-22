
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		String[] tmp  = scanner.nextLine().split(" ");

		for(int i = 0; i < n; i++) {

			int now = Integer.parseInt(tmp[i]);

			if(now % 2 == 0) {

				if(now % 3 != 0 && now % 5 != 0) {

					System.out.println("DENIED");
					return;

				}
			}
		}
		System.out.println("APPROVED");
	}
}