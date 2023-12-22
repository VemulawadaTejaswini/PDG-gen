import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		double n = sc.nextInt();
		double d = sc.nextInt() * 2 + 1;
		sc.close();
		double ans = Math.ceil(n/d);
		System.out.println((int)ans);
	}
}
