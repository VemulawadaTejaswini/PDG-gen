import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		Arrays.sort(s);
		for (int i = 0; i < s.length - 1; i++) {
			if (!s[i].equalsIgnoreCase(s[i + 1])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
