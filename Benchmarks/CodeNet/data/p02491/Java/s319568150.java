import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(x / y + " " + x % y + " "
				+ (String.format("%.12f", (double) x / y)));
	}
}