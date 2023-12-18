
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a % b;
		String ans = "NO";
		for (int i = 1; i <= b; i++) {
			
			if ((d * i) % b == c) {
				ans = "YES";
				break;
			}
		}
		System.out.println(ans);
	}
}
