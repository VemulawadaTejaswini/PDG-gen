import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int d = in.nextInt();
			if (d == 0) break;
			String s = new String(""+d);
			int ans = 0;
			for(int i=0;i<s.length();i++) {
				ans += Integer.parseInt(""+s.charAt(i));
			}
			System.out.println(ans);
		}
	}
}