import java.util.Scanner;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		char[] s = new char[n];
		char[] t = new char[n];	
		for(int i = 0;i<n;i++)
			s[i] = S.charAt(i);
		
		for(int i = 0;i<n;i++)
			t[i] = T.charAt(i);
		
		for(int i = 0;i<n;i++) {
			System.out.print(s[i]);
		    System.out.print(t[i]);
		}
		    sc.close();
	}
	public static void main(String[] args) {
		solve();

	}

}
