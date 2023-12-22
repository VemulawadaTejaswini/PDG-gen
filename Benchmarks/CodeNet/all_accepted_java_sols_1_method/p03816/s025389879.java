import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		int c = 1;
		for (int i = 1; i < n; i++)
			if (a[i] != a[i - 1])
				c++;
		if (c % 2 == 0)
			System.out.println(c - 1);
		else
			System.out.println(c);
	}
}