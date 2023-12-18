import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String _0 = s.replaceAll("1", "");
		String _1 = s.replaceAll("0", "");
		
		int ans = Math.min(_0.length(), _1.length()) * 2;
		System.out.println(ans);
		
	}
}
