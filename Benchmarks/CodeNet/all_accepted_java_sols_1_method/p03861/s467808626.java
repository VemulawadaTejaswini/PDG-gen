
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		long n = a / x;
		long m = b / x;
		if (a % x == 0) {
			n--;
		}
		System.out.println(m - n);
	}
}
