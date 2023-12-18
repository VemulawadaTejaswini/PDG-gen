import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public long factorial(long n) {
		if (n == 1) return 1;
		else return n*factorial(n-1);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Main m = new Main();

		while (sc.hasNext()) {
			System.out.println(m.factorial(sc.nextLong()));
		}

	}
}