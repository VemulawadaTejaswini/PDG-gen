import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		if(a%2==0&&b%2==0%2&&c%2==0) {
			int count = 1;
			for(int i = 0; i < 30; i++) {
				long na = b/2+c/2;
				long nb = a/2+c/2;
				long nc = a/2+b/2;
				a = na;b = nb;c = nc;
				if(a%2==0&&b%2==0&&c%2==0) {
					count++;
				} else {
					System.out.println(count);
					return;
				}
			}
		} else {
			System.out.println(0);
			return;
		}
		System.out.println(-1);
	}
}