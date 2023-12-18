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

		long finalA = initA + v * t;
		long finalB = initB + w * t;

		long diffInit = (long)Math.signum(initB - initA);
		long diffFinal = (long)Math.signum(finalB - finalA);

		if(diffInit * diffFinal <= 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
