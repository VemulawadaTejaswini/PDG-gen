
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long num = 1;
		long ans = 0;
		while(h != 1) {
			h /= 2;
			ans += num;
			num *= 2;
		}
		ans += num;
		System.out.println(ans);
	}

}
