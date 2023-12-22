import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = n-1;

		for(long i =1; i * i <= n;i++) {
			if(n % i != 0) {
				continue;
			}else {
				if(min > i + n/i -2) {
					min = i + n/i -2;
				}
			}
		}
		System.out.println(min);

	}
}