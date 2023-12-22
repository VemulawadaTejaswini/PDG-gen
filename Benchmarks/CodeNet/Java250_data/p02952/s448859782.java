
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int i = 0;
		while(true) {
			int div = n / (int) Math.pow(10, i);
			int mod = n % (int) Math.pow(10, i);
			if(div >= 10) {
				ans += Math.pow(10, i) * 9;
			} else if(div > 0) {
				ans += (div - 1) * Math.pow(10, i);
				ans += mod + 1;
				break;
			} else {
				break;
			}
			i += 2;
		}
		System.out.println(ans);
	}

}
