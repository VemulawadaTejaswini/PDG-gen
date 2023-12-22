import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		String[] numb      = scanner.nextLine().split(" ");
		int ans = 0;

		for(String x : numb) {

			ans += k <= Integer.parseInt(x) ? 1 : 0;


		}



		System.out.println(ans);

		}

}
