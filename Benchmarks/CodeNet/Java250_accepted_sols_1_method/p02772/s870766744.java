import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int[] a = new int[t];
		boolean b = true;
		for (int i = 0; i<t; i++) {
			a[i] = sc.nextInt();
			if (a[i]%2 == 0) {
				if (a[i] % 3 == 0 || a[i] % 5 == 0) {
					b = true;
				}
				else {
					b = false;
					break;
				}
			}

		}

		System.out.println (b ? "APPROVED" : "DENIED");
	}
}
