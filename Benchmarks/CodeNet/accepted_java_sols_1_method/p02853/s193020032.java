import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long x = in.nextInt();
		long y = in.nextInt();

		int won = 0;

		if (x == 1)
			won += 300000;
		else if (x == 2)
			won += 200000;
		else if (x == 3)
			won += 100000;

		if (y == 1)
			won += 300000;
		else if (y == 2)
			won += 200000;
		else if (y == 3)
			won += 100000;

		if (x == 1 && y == 1)
			won += 400000;

		System.out.println(won);
	}
}

