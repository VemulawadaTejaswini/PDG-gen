import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		
		int count = 0;
		char ch = S.charAt(0);
		for(int i = 1; i < N; i++) {
			if(ch != S.charAt(i)) {
				ch = S.charAt(i);
				count++;
			}
		}
		
		int result = (N - 1) - count;
		result += (Math.min(count - 1, K))*2;
		if(count <= K)result++;
		
		System.out.println((count!=0)?Math.min(result, N - 1):N-1);
	}
}