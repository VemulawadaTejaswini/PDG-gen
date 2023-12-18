import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		long n = h * w;
		if(h == 1 || w == 1) {
			System.out.println(1);
			System.exit(0);
		}

		if(n % 2 == 0) {
			System.out.println(n / 2);
		}else {
			System.out.println(n / 2 + 1);
		}
		sc.close();
	}
}
