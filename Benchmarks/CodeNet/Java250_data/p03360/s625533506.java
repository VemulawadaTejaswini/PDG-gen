import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		Arrays.sort (a);
		int max = a[2];
		for (int i = 0; i<k; i++) {
			max*=2;
		}
		int val = a[0] + a[1] + max;
		System.out.println(val);

	}
}
