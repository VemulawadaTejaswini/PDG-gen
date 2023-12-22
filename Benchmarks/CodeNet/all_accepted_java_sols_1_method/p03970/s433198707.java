import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		String correct  = "CODEFESTIVAL2016";
		int ans = 0;
		for (int i = 0; i < correct.length(); i++) {
			if(s.charAt(i) != correct.charAt(i)){
				ans++;
			}
		}
		System.out.println(ans);
	}
}