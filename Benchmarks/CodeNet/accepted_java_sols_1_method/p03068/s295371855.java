import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();
		
		char c = s.charAt(k-1);
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < n; i++) {
			if(ch[i] != c) {
				ch[i] = '*';
			}
		}
		for(char chr : ch) {
			System.out.print(chr);
		}
		System.out.println();
	}
}
