import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[4];
		for (int i = 3; i>=0; i--) {
			a[i] = n%10;
			n/=10;
		}
		if (a[0] == a[1] || a[1] == a[2] || a[2] == a[3]) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}
	}
}
