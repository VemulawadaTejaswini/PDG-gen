
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String s = sc.next();
		
		
		long ans = 0;
		int aCount = 0;
		int pos = 0;
		
		while(pos<s.length()) {
			
			if (s.charAt(pos) == 'A') {
				aCount++;
				pos++;
			} else if (s.charAt(pos) == 'B' && pos+1<s.length() && s.charAt(pos+1) == 'C') {
				ans += aCount;
				pos += 2;
			} else {
				aCount = 0;
				pos++;
			}
		}
		
		
		
		System.out.println(ans);
	}
}
