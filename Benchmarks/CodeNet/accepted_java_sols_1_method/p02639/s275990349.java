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
		for (int i = 0; i < 5; i++) {
			int x = in.nextInt();
			if (x==0) {
				System.out.println(i+1);
				break;
			}
		}
	}
}