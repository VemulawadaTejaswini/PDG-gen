import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int a = in.nextInt();

			String op = in.next();
			int b = in.nextInt();
			int res;
			if ("+".equals(op)) {
				res = a + b;
			} else if ("-".equals(op)) {
				res = a - b;
			} else if ("*".equals(op)) {
				res = a * b;
			} else if ("/".equals(op)) {
				res = a / b;
			} else {
				break;
			}
			System.out.println(res);
		}
	}
}