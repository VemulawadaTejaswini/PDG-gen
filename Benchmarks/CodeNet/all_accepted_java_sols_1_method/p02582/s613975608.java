import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] S = s.toCharArray();

		int c = 0;
		boolean rain = false;
		for (int i = 0; i<2; i++) {
			if (S[i] == S[i+1] && S[i] == 'R') {
				c++;

			}
		}
		for (int i = 0; i<3;i++) {
			if (S[i] == 'R') {
				rain = true;
			}
		}
		if (rain) {
			System.out.println(c+1);
		} else {
			System.out.println(0);
		}
	}
}