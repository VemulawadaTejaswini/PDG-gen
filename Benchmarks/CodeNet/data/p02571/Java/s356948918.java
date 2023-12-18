import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int minChanges = Integer.MAX_VALUE;
		for(int i = 0 ; i <= S.length() - T.length(); i++) {
			int iter = 0;
			int temp = 0;
			while(iter < T.length()) {
				if(S.charAt(i+iter) != T.charAt(iter)) {
					temp++;
				}
				iter++;
			}
			minChanges = Math.min(temp, minChanges);
		}
		System.out.println(minChanges);
	}
}
