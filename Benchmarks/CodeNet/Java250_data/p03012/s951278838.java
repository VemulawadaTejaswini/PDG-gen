
import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] temp = sc.nextLine().split(" ");
		int[] list = new int[n];
		int ans = 0;

		list[0] = Integer.parseInt(temp[0]);
		for(int i = 1; i < n; i++) {

			list[i] = list[i - 1] + Integer.parseInt(temp[i]);
		}

		ans = list[n - 1];
		for(int i = 1; i < n - 1; i++) {

			ans = Math.min(ans, Math.abs((list[n - 1] - list[i]) - list[i]));

		}

		System.out.println(ans);

	}
}