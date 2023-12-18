import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String W = in.nextLine();
		W = W.toLowerCase();
		int ans = 0;
		while(in.hasNext()) {
			String s = in.nextLine();
			s = s.toLowerCase();
			while(s.indexOf(W) != -1) {
				if(s.equals(W) || s.contains(" "+W)) {
					ans++;
				}
				s = s.substring(s.indexOf(W)+W.length());
			}
			if(s.equals("END_OF_TEXT")) break;
		}
		System.out.println(ans);
	}
}