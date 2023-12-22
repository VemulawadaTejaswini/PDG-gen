import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		String[] value = scan.nextLine().split(" ");
		String[] cost = scan.nextLine().split(" ");

		int ans = 0;


		for(int i = 0; i < n; i++) {

			int temp = Integer.parseInt(value[i]) - Integer.parseInt(cost[i]);

			ans = temp > 0 ? ans + temp : ans;
		}


		System.out.println(ans);
	}

}
