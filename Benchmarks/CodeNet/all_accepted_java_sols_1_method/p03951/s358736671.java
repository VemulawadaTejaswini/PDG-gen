import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		for(int i=0;;i++) {
			String ans = s.substring(0, i) + t;
			if (ans.startsWith(s)) {
				System.out.println(ans.length());
				return;
			}
		}
	}

}
