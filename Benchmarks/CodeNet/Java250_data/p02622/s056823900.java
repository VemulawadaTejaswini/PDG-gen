import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s = sc.next();
			String t = sc.next();

			int cnt = 0;

			for(int it = 0; it < s.length(); it++) {
				if(s.charAt(it) != t.charAt(it)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
