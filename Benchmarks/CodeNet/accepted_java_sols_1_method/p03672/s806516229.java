import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int max = 0;
		for(int i = 0;i < S.length()/2;i++) {
			String key = S.substring(0,i+1);
			if(2*i > S.length()) {
				continue;
			}
			if((key.equals(S.substring(i+1, 2*i+2)))
					&&key.length() != S.length()/2) {
				max = 2 * key.length();
			}
		}
		System.out.println(max);
	}
}