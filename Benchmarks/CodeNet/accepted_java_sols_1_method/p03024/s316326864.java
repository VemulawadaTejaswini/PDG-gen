import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int lose = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'x')
				lose ++;
		}
		System.out.println(lose >= 8 ? "NO" : "YES");

	}

}
