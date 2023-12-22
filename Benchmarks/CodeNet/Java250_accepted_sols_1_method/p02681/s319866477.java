import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		String T = scan.next();
		int count = 0; 
		
		for(int i=0;i<S.length();i++) {
			char s = S.charAt(i);
			char t = T.charAt(i);
			if(s == t) {
				count++;
			}
		}
		if(count == S.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
