import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans1 = 0;
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				if(S.substring(i, i + 1).equals("1")) ans1++;
			} else {
				if(S.substring(i, i + 1).equals("0")) ans1++;
			}
		}
		int ans2 = 0;
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				if(S.substring(i, i + 1).equals("0")) ans2++;
			} else {
				if(S.substring(i, i + 1).equals("1")) ans2++;
			}
		}
		System.out.println(Math.min(ans1, ans2));
	}
}
