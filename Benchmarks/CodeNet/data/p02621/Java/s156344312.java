
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

//1, 12, 123, 1234
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long sum = n;
		for (int i = 2; i <= 3; i++) {
			sum+=Math.pow(n, i);
		}
		System.out.println(sum);
	}
}