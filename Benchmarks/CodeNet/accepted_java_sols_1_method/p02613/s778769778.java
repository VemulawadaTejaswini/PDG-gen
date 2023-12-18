
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int N = Integer.parseInt(line);
		String[] S = new String[N];

		for(int i = 0 ; i < S.length;  i++) {
			S[i] = sc.nextLine();
//			System.out.println(S[i]);
		}

		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		for(String s: S) {
			if(s.equals("AC")) {
				ac++;
			}else if(s.equals("WA")) {
				wa++;
			}else if(s.equals("TLE")) {
				tle++;
			}else {
				re++;
			}
		}

		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + re);
	}

}
