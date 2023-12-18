import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		int sl = S.length;
		int tl = T.length;
		int ans = tl;
		for(int i=0; i+tl<=sl; i++) {
			int match = 0;
			for(int j=0; j<tl; j++) {
				if(S[i+j]==T[j])
					match++;
			}
			ans = Math.min(ans, tl-match);
		}
		System.out.println(ans);

		sc.close();
	}
}
