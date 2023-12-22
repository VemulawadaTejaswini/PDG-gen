import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int i = sc.nextInt();
		int ans = n - i + 1;

		System.out.println(ans);
		sc.close();
	}
}