import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] S = scan.next().toCharArray();
		char[] T = scan.next().toCharArray();
		int count = 0;
		for(int i = 0; i < S.length; i++) {
			if(S[i] != T[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}