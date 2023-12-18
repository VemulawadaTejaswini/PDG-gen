
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[n];
		double ans = 0;
		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(temp[i]);
			ans += 1.0 / list[i];
		}


		ans = 1 / ans;

		System.out.println(ans);







	}



}
