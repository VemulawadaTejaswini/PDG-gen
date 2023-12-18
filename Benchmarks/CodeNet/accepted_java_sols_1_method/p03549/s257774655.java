

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long s = (m * 1900) + ((n - m) * 100);
		System.out.println(s * (long) Math.pow(2, m));
	}
}
