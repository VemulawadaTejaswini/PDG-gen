import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int count = 0;

		for(int i = 0; i < n-1; i++) {
			String cur = s.substring(i, i+1);
			String next = s.substring(i+1, i+2);
			if(cur.equals(next)) {
				count++;
			}
		}
		int ans = s.length() - count;
		System.out.println(ans);
	}
}