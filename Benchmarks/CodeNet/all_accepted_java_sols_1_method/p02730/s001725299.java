import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		int N = s.length;
		
		for(int i=0; i<((N-1)/2+1)/2; i++) {
			if(s[i] != s[(N-1)/2-1-i] || s[i] != s[(N-1)/2+1+i] || s[i] != s[N-1-i]) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		System.out.println("Yes");

		sc.close();
	}
}
