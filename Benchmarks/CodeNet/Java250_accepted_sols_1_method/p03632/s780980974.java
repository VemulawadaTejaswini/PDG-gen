
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = Math.max(a, c);
		int f = Math.min(b, d);
		
		if (f >= e) {
			System.out.println(f - e);
		} else {
			System.out.println(0);
		}

	}
}
