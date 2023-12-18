import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();
		
		char it = S.charAt(K-1);

		for (int i = 0; i< S.length(); i++) {
			if (it != S.charAt(i)) {
				S = S.substring(0,i)+ '*' +S.substring(i+1);
			}
		}
		System.out.println(S);
	}
}	
