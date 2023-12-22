import java.util.*;

public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int R = N;
		char[] S = s.toCharArray();
		for(int i = 0; i < N-1; i++) {
			if(S[i] == S[i+1]) {
				R--;
			}
		}
		System.out.println(R);
	}
}
