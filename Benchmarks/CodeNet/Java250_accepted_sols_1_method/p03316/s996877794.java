
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sn = 0;
		long div = n;
		while(div != 0) {
			sn += div % 10;
			div /= 10;
		}
		if(n % sn == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
