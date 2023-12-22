import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long sum = 100;
		double rate = 1.01;
		long x;
		Scanner scan = new Scanner(System.in);

		x = scan.nextLong();

		int i = 0;
		while(sum < x) {
			i++;
			sum *= rate;
		}

		System.out.println(i);
	}
}
