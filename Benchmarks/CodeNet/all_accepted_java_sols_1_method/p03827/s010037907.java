import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int max = 0;
		int x = 0 ;
		for (int i = 0 ; i < n ; i++) {
			if (s.charAt(i) == 'I') x++;
			if (s.charAt(i) == 'D') x--;
			if (x > max) max = x;
		}
		System.out.println(max);
	}
} 