import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] orig = "CODEFESTIVAL2016".toCharArray();
		char[] my = sc.next().toCharArray();
		int ans = 0;
		for (int i = 0; i < my.length; ++i) {
			if (orig[i] != my[i]) ++ans;
		}
		System.out.println(ans);
	}

}
