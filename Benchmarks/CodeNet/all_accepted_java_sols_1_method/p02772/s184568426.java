import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.stream(a).filter(value -> value % 2 == 0).forEach(value -> {
				if(value % 3 != 0 && value % 5 != 0) {
					System.out.println("DENIED");
					System.exit(0);
				}
			});
			System.out.println("APPROVED");
		}

	}

}
