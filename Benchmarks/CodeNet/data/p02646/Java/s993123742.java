import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		long initA = stdIn.nextLong();
		long v = stdIn.nextLong();

		long initB = stdIn.nextLong();
		long w = stdIn.nextLong();

		long t = stdIn.nextLong();

		stdIn.close();

		if(v - w <= 0) {
			System.out.println("NO");
			return;
		}

		long dist = Math.abs(initB - initA);

		long diffSpeed = v-w;

		if(diffSpeed * t >= dist) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}