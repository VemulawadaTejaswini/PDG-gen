import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		System.out.println(t-2*n>0 ? t-2*n : "0");
	}
}
