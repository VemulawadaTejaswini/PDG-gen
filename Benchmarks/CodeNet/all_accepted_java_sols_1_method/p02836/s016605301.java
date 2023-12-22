//Atcoder ABC147 B

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char S[] = sc.next().toCharArray();
		int length = S.length;
		int cnt = 0;

		for(int i=0;i<length;i++) {
			if(S[i]!=S[length-i-1]) {
				cnt++;
			}
          	S[i] = S[length-i-1];
		}
		System.out.println(cnt);
	}

}
