
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String ans = "NO";
		for (int i = a; i < a * b; i += a) {
			if (i % b == c) {
				ans = "YES";
				break;
			}
		}
		System.out.println(ans);
	}
}