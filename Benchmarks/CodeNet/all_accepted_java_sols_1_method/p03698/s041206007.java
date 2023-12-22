import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String[] s = S.split("");
		
		for(int i = 0; i < s.length - 1; i++) {
			for(int j = i + 1; j < s.length; j++) {
				if(s[i].equals(s[j])) {
					System.out.println("no");
					return;
				}
			}
		}
		System.out.println("yes");
	}
}
