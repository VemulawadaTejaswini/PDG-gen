import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int d = Integer.parseInt(tmp[1]);

		double range = d * 2 + 1;
		double ra = n / range;
		int ans = (int)Math.ceil(ra);
		System.out.println(ans);


	}
}
