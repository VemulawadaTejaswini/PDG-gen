import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		char[] S = stdIn.next().toCharArray();
		char[] T = stdIn.next().toCharArray();
		
		int cnt = 0;
		
		for(int i = 0; i < S.length; i ++) {
			if(S[i] != T[i]) {
				cnt ++;
			}
		}
		
		System.out.println(cnt);
	}
}