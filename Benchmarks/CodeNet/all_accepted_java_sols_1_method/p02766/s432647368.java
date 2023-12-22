
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int k = sc.nextInt();
		long ans = 1;
		while(n > 0) {
			n /= k;
			if(n > 0)
				ans++;
		}
		System.out.println(ans);
	}

}
