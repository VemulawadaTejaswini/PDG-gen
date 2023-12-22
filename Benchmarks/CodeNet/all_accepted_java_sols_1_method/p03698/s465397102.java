import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int flg = 0;
		for(int i = 0;i < S.length();i ++) {
			for(int k = i + 1;k < S.length();k ++) {
				if(S.charAt(i) == S.charAt(k)) flg = 1;
			}
		}
		if(flg == 0) System.out.println("yes");
		else System.out.println("no");
	}
}