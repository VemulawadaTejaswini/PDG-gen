import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] a = new String[] {sc.next(), sc.next()};
		int l = a[0].length() + a[1].length();
		for (int i = 0; i < l; i++) {
			System.out.print(a[i % 2].charAt(i / 2));
		}
		System.out.println();
	}
}