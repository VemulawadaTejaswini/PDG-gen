import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		String t = scan.next();
		int ans = 0;
		for(int i = 0; i < s.length(); i++) {
			String tempS = s.substring(i, i+1);
			String tempT = t.substring(i, i+1);
			if(!tempS.equals(tempT)) {
				ans++;
			}
		}
		System.out.print(ans);
	}
}