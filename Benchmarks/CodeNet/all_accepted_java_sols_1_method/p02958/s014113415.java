import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int nums[] = new int [n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				int temp = sc.nextInt();
				if (temp != i+1) {
					count++;
				}
			}

			if (count == 2 || count == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

	}

}