import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		boolean flg = false;
		Main main = new Main();
		for (int i = 0; i < T.length(); i++) {
			if (S.equals(T)) {
				flg = true;
				break;
			}else {
				S = main.rotateString(S, true);
			}
		}

		if (flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	//true=right false=left
	public String rotateString(String s,boolean direction) {
		if (s.length() == 0) {
			return s;
		}else {
			//右
			if (direction) {
				s = s.substring(s.length()-1, s.length()) + s.substring(0, s.length()-1);
			}else {
				s = s.substring(1) + s.substring(0, 1);
			}
			return s;
		}
	}

}

