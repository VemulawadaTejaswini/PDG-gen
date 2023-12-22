import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		String S1 = S.substring(0,N/2);
		String S2 = S.substring((N+1)/2);
		int ans = 0;
		for(int i = 0; i < N/2; i++)
			if(S1.charAt(i) != S2.charAt(N/2-1-i))
				ans++;
		System.out.println(ans);

	}

}