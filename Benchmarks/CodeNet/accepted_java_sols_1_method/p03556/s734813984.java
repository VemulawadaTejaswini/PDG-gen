
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int target = 0;
		for (int i = n; 1 <= i; i--) {
			target = (int) Math.sqrt(i);
			if (i == Math.pow(target, 2)) {
				target = i;
				break;
			}
		}

		System.out.println(target);

	}

}
