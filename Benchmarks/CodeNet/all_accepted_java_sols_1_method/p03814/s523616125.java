import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int from = 0;
		int end = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A') {
				from = i;
				break;
			}
		}
		
		for(int i = s.length() - 1; i > -1; i--) {
			if(s.charAt(i) == 'Z') {
				end = i;
				break;
			}
		}
		
		System.out.println(end + 1 - from);
	}
}
