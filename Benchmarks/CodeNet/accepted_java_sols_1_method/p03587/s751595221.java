
import java.util.Scanner;


public class Main {
	static String S;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 S = sc.next();
		sc.close();

		int ans = 0 ;
		for (int i = 0; i < S.length(); i++) {
			if(String.valueOf(S.charAt(i)).equals("1")){
				ans++;
			}
		}

		System.out.println(ans);

	}
}
