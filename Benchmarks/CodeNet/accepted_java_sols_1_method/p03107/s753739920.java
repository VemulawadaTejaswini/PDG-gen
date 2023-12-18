import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int r = 0;
		int b = 0;
		for (char c : s.toCharArray()) {
			if ('0' == c) {
				r++;
			} else {
				b++;
			}
		}
		
		int ans = Math.min(r, b);
		
		System.out.println(ans*2);
	}
}
