import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		long px1 = scane.nextLong();

		long py1 = scane.nextLong();

		long p2x1 = scane.nextLong();

		long p2y1 = scane.nextLong();


		System.out.println(Math.hypot((p2x1-px1),(p2y1-py1)));

	}

}