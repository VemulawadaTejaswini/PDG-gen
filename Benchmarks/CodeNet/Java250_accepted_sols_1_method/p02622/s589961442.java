import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		String T = scan.next();
		int ans = 0;

		String[] splitedS = S.split("");
		String[] splitedT = T.split("");

		for(int i = 0;i < S.length(); i++) {
			if(!(splitedS[i].equals(splitedT[i]))) {
				ans++;
			}
		}

		System.out.println(ans);

	}
}