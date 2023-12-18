import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String K = sc.next();
		int numK = K.length();
		String S = sc.next();
		int numS = S.length();
		if(numS <= numK) {
			System.out.print(S);
		} else {
			System.out.print(S.substring(0, numK) + "...");
		}
	}
}
