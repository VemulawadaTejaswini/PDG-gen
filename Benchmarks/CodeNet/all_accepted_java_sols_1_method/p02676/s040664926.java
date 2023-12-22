import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int K	 = scn.nextInt();
		String S = scn.next();
		scn.close();
		if (S.length() <= K) {
			System.out.println(S);
		}else {
			String ans = S.substring(0,K);
			System.out.println(ans+"...");
		}
	}

}
