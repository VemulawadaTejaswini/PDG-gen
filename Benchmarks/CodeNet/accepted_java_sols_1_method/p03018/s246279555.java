import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String S_2 = S.replace("BC","D");
		long cnt=0L;
		int cnt_a=0;
		for (int i=0;i<S_2.length();i++) {
			if (S_2.charAt(i)=='A') {
				cnt_a++;
			} else if (S_2.charAt(i)=='D') {
				cnt+=cnt_a;
			} else {
				cnt_a=0;
			}
		}
		System.out.println(cnt);
	}
}
