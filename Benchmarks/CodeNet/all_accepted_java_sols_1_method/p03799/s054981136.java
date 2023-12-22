import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long n = sc.nextLong();
		long m = sc.nextLong();
		long sum;
		if (m - n * 2 > 0) {
			sum = n;
			sum += (m - n * 2) / 4;
		} else {
			sum = m / 2;
		}
		System.out.println(sum);
	}
}
