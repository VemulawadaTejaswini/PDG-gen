import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		String S = stdIn.next();
		
		String[] s = S.split("",0);
		
		s[K-1] = s[K-1].toLowerCase();
		
		String a = String.join("", s);
		
		System.out.println(a);
	}
}