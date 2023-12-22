import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cnt_zero = 0, cnt_one = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == '0') cnt_zero++;
			else cnt_one++;
		}
		System.out.println(2 * Math.min(cnt_zero, cnt_one));
	}
}