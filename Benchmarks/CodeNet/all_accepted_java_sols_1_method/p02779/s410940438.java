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
			Arrays.sort(a);
			for(int i = 0 ; i < n - 1 ; i++) {
				if(a[i] == a[i + 1]) {
					System.out.println("NO");
					System.exit(0);
				}
			}
			System.out.println("YES");
		}

	}

}
