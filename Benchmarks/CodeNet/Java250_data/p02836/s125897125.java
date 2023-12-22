import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] n = str.split("");
		int ans = 0;
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++) {
			if (!n[i].equals(n[j--]))ans++;
		}
		System.out.println(ans);
	}
}