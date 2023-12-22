
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long d = sc.nextLong();
		long n = sc.nextLong();
		
		long a = 0;
		if (n == 100) {
			a = (long) Math.pow(100, d) * (n + 1);
		} else {
			a = (long) Math.pow(100, d) * n;
			
		}
		
		System.out.println(a);
		
	}
}