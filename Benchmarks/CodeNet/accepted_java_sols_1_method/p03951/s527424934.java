import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		for(int i = 0 ; i < n ; i++) {
			if(s.substring(i).equals(t.substring(0, n - i))) {
				System.out.println(i + n);
				return;
			}
		}
		System.out.println(s.length() + t.length());
	}
}
