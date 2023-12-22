import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long amari = x % 11;
		if (amari == 0) {
			System.out.println(x / 11 * 2);
		} else if (amari <= 6) {
			System.out.println(x / 11 * 2 + 1);
		} else {
			System.out.println(x / 11 * 2 + 2);
		}
	}
}