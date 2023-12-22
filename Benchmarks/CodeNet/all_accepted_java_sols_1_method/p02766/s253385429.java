import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int k = sc.nextInt();
		int i = 0;
		while(n != 0) {
			n /= k;
			i++;
		}

		System.out.println(i);
		sc.close();
	}
}
