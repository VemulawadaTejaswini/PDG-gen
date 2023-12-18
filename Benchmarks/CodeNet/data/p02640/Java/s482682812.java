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
		int x = in.nextInt();
		int y = in.nextInt();
		boolean status = false;
		for (int a = 1; a < x+1; a++) {
			int b = x-a;
			if ((2*a)+(4*b)==y) {
				status = true;
			}
		}
		if (status==true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}