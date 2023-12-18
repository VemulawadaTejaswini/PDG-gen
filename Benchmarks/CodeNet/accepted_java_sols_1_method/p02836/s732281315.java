import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer();
		for(int i = S.length(); i > 0; i--) {
			sb.append(S.charAt(i - 1));
		}
		String R = sb.toString();

		int count = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) != R.charAt(i)) {
				count++;
			}else {
				continue;
			}
		}
		System.out.println(count / 2);
	}

}