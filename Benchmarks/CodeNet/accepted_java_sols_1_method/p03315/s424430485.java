import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		char[] c = S.toCharArray();
		
		int ans = 0;
		
		for (char m : c) {
			if ('+' == m) ans++;
			if ('-' == m) ans--;
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
