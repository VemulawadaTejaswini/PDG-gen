import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();

		int ans = t.length();

		for (int i = 0; i <= s.length()-t.length(); i++) {
			int diff=0;
			for (int j = 0; j < t.length(); j++) {
				if(s.charAt(i+j) != t.charAt(j) ) {
					diff++;
				}
			}
			ans = Math.min(ans,diff);
		}

		System.out.println(ans);


	}

}