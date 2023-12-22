import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = (int)1e9 + 7;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e7;
	
	
	void doIt() {
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		int len = S.length;
		int sum = 0;
		for(int i = 0; i < len; i++) {
			if(S[i] != T[i])sum++;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
 
}