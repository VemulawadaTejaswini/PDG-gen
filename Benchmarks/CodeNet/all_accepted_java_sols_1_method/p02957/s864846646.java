import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = 0, b = 0;

		try {
			String[] s = scanner.nextLine().split(" ");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
		}

		scanner.close();
		
		if (((a - b) % 2) != 0) {
			System.out.println("IMPOSSIBLE");
		} else {
		 	int v = Math.abs (a - b) / 2;
		 	
		 	int ret;
		 	if (a > b) {
		 		ret = b + v;
		 	} else {
		 		ret = a + v;
		 	}
		 	System.out.println(ret);
		}
	}
}
