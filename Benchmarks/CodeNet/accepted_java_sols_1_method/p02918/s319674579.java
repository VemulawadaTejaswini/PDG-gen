
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		
		int score = 0;
		for(int i=0;i<S.length()-1;i++) {
			if(S.charAt(i)==S.charAt(i+1)) score++;
		}
		int ans = Math.min(score+2*K, N-1);
		
		System.out.println(ans);
	}
}