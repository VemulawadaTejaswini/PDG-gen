import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		char[] c = s.toCharArray();
		
		int res = 0;
		
		for(int i = 1; i < s.length(); i++) {
			char ch = c[i];
			
			if(c[i-1] == ch) {
				c[i] = c[i-1] == '0' ? '1' : '0';
				res++;
			}
		}
		System.out.println(res);
	}
}
