import java.util.Scanner;

public class Main {
	public static String left = "qwertasdfgzxcvb";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			if (s.equals("#")) {
				break;
			}
			int ans = 0;
			int bef = -1;
			for(int i=0;i<s.length();i++) {
				int now = -1;
				if (isLeft(s.charAt(i))) {
					now = 0;
				}else{
					now = 1;
				}
				if (bef != -1 && bef != now) {
					ans++;
				}
				bef = now;
			}
			System.out.println(ans);
		}
	}

	public static boolean isLeft(char c) {
		return left.indexOf(c) >= 0;
	}

}