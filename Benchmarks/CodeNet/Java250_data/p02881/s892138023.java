import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long a = in.nextLong();

		for (long i=(long)(Math.sqrt(a)); i>1; i--) {
			if (a%i == 0) {
				System.out.println(i + a/i - 2);
				System.exit(0);
			}
		}
		System.out.println(a - 1);
	}
}

