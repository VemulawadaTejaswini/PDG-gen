import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int K	 = scn.nextInt();
		String S = scn.next();
		scn.close();
		if (S.length()-1 <= K) {
			System.out.println(S);
		}else {
			String ans = "";
			for(int i = 0 ; i <7 ; i++) {
				ans += S.charAt(i);
			}
			System.out.println(ans+"...");
		}
	}

}
