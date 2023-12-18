import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long ans = 0;
		if (n >= 3 && m >= 3) ans = (n-2)*(m-2);
		else if (n == 2 || m == 2) ans = 0;
		else if (n == 1 && m== 1) ans = 1;
		else if (n == 1) ans = m-2;
		else if (m == 1) ans = n-2;
		System.out.println(ans);
	}
}
