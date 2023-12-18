import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		boolean ok = true;
		for(int i = 0; i < S.length; i++) {
			if(i % 2 == 0) {
				if(S[i] == 'L')
					ok = false;
			}
			else {
				if(S[i] == 'R')
					ok = false;
			}
		}
		System.out.println(ok ? "Yes" : "No");

	}

}
