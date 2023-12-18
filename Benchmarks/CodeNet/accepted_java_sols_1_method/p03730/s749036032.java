import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean pos = false;
		for (int i = 1; i <= b; i++) {
			if (a * i % b == c) {
				pos = true;
				break;
			}
		}
		if (pos) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}