import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] s = S.toCharArray();
		int ans = 0;

		boolean marubatsu = true;
		char work = s[0];
		for(int i = 1; i < N; i++) {
			if(marubatsu) {
				if(s[i] == changeMaruBatsu(work)) {
					ans++;
					marubatsu = false;
				}
			}else {
				work = s[i];
				marubatsu = true;
			}
		}

		System.out.println(ans);
		sc.close();
	}

	public static char changeMaruBatsu(char c) {
		if(c == 'O') {
			return 'X';
		}
		return 'O';
	}
}
