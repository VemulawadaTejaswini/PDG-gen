import java.util.*;
public class Main {

	public static void main(String[] args) {
		int MOD = 1_000_000_007;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S1 = sc.next().toCharArray();
		char[] S2 = sc.next().toCharArray();
		boolean v = true;
		long ans;
		int t = 1;
		if(S1[0] == S2[0])
			ans = 3;
		else {
			ans = 6;
			t = 2;
			v = false;
		}	
		for(int i = t; i < N; i++) {
			if(S1[i] == S2[i]) {
				if(v)
					ans *= 2;
				else
					v = true;
			}
			else {
				if(v)
					ans *= 2;
				else
					ans *= 3;
				i++;
				v = false;
			}
			ans %= 1_000_000_007;
		}
		System.out.println(ans);
	}

}