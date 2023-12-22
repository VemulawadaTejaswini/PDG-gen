import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		long left = scan.nextLong();
		long right = scan.nextLong();

		// check
		long min = Long.MAX_VALUE;
		fin: for(long i = left; i < right; i++) {
			for(long j = i + 1; j <= right; j++) {
				if(i * j % 2019 < min) {
					min = i * j % 2019;
				}
				if(j % 2019 == 0 || i % 2019 == 0) {
					min = 0;
					break fin;
				}
			}
		}

		System.out.println(min);
	}
}

