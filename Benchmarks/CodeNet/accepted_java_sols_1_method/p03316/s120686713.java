
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s =String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = Integer.parseInt(s.substring(i, i + 1));
			sum += a;
		}
		if (n % sum == 0) System.out.println("Yes");
		else System.out.println("No");
		
	}
}