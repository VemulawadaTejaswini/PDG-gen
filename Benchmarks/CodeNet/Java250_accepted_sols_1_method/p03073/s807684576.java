import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int n = c.length;
		boolean swi = false;
		char[] a = new char[n];
		char[] b = new char[n];
		for (int i = 0; i < n; i++, swi = !swi) {
			a[i] = swi ? '1' : '0';
			b[i] = swi ? '0' : '1';
		}
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < n; i++) {
			if (c[i] != a[i])
				countA++;
		}
		for (int i = 0; i < n; i++) {
			if (c[i] != b[i])
				countB++;
		}
		System.out.println(Math.min(countA, countB));

	}

}
