import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] pm = new char[4];
		int ans = 0;

		for(int i=0; i<4; i++) {
			pm[i] = S.charAt(i);
			if(pm[i] == '+') {
				ans += 1;
			}else {
				ans -= 1;
			}
		}
		System.out.println(ans);

	}

}
