import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S =sc.next();
		sc.close();

		int zero = 0;
		int one = 0;
		for(int i = 0;i < S.length();i++) {
			if(S.charAt(i)=='0') {
				zero++;
			}else {
				one++;
			}
		}
		System.out.println(2*Math.min(zero, one));
	}
}