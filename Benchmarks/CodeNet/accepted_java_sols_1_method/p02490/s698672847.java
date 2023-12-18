import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		for (int i = 1; ; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (x == 0 && y == 0) break;
			if (x < y) System.out.println(x + " " + y);
			else System.out.println(y + " " + x);
		}
	}
}