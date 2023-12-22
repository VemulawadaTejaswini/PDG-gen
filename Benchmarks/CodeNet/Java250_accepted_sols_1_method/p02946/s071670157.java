
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int k = Integer.parseInt(temp[0]);
		int n = Integer.parseInt(temp[1]);

		for(int i = n - k + 1; i < k + n; i ++) {

			System.out.println(i);

		}


	}

}
