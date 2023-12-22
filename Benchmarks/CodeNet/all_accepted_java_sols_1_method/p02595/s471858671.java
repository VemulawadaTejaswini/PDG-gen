import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		long d2 = d * d;
		long count = 0;
		for(int i = 1 ; i <= n ; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			if(x * x + y * y <= d2) {
				count++;
			}
		}

		sc.close();
		System.out.println(count);

	}
}

