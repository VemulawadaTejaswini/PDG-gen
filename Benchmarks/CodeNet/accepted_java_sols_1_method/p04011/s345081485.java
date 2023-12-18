import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
	public static long n, k, x, y, s1, s2 = 0;
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner in = new Scanner(new File("input.txt"));
		Scanner in = new Scanner(System.in);
		n = in.nextLong();
		k = in.nextLong();
		x = in.nextLong();
		y = in.nextLong();
		if(n > k) System.out.println(x*k + (n-k)*y);
		else System.out.println(x*n);
	}
}