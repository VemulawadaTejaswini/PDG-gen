import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 29, 2020 9:22:05 PM
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextInt();
		long y = in.nextInt();
		String status = "No";
		for (int a = 1; a < x+1; a++) {
			long b = x-a;
			if ((2*a)+(4*b)==y) {
				status = "Yes";
			}
		}
		System.out.println(status);
	}
}
