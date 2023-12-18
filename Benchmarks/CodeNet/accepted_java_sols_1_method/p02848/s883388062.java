import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] cc = S.toCharArray();
		
		for(int i=0;i<S.length();i++) {
			int n = (cc[i]-65+N)%26;
			cc[i] = (char) (n+65);
		}
		String SS = new String(cc);
		System.out.println(SS);
	}
}