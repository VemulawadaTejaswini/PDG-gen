
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp1 = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp1[0]);
		int m = Integer.parseInt(temp1[1]);

		int ans = 0;
		int temp = 0;
		//m/n
		int a1 = (int) Math.floor(m / n);

		//mの約数
		for(int i = a1; i > 0; i--) {
			temp = m;
			if(temp % i == 0) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}

