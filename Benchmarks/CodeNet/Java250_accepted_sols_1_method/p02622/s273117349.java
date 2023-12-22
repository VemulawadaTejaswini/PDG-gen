import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

//1, 12, 123, 1234
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int count = 0;
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i)!=t.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}