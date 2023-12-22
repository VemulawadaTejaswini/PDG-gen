import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		if (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();

			int result = (int)((long) a % 2 * b % 2) % 2;
			if (result == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
	}
}
