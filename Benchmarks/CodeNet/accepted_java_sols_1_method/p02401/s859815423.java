import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true) {
			int x = stdIn.nextInt();
			String y = stdIn.next();
			int z = stdIn.nextInt();
			if ("?".equals(y)) break;

			if ("+".equals(y)) {
				System.out.printf("%d%n", x + z);
			} else if ("-".equals(y)) {
				System.out.printf("%d%n", x - z);
			} else if ("*".equals(y)) {
				System.out.printf("%d%n", x * z);
			} else if ("/".equals(y)) {
				System.out.printf("%d%n", x / z);
			}
    	}
		stdIn.close();
	}
}

