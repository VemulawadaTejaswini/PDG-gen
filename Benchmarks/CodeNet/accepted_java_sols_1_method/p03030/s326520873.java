
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int m = Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next() + "," + (m - sc.nextInt()) + "," + (i + 1);
		}
		Arrays.sort(s);
		for (String a : s) {
			System.out.println(a.split(",")[2]);
		}
		
	}
}
