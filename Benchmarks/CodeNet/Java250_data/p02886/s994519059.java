import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		int n = Integer.parseInt(scanner.nextLine());

		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[n];

		for(int i = 0; i < n; i ++) {

			list[i] = Integer.parseInt(temp[i]);

		}

		int ans = 0;

		for(int i = 0; i < n; i ++) {
			for(int j = i + 1; j < n; j++) {

				ans += list[i] * list[j];

			}
		}
		System.out.println(ans);
	}
}
