import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char[] n = sc.next().toCharArray();
		int ans = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == '2') {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
