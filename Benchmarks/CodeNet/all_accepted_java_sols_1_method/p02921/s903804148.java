import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		int cnt = 0;
		for(int i = 0; i < S.length; i++) {
			if (S[i] == T[i])
				cnt++;
		}
		out.println(cnt);
		
	}
}