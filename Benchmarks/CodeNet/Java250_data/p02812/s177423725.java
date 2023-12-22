import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		int cnt = 0;

		Character[] n= new Character[51];

		for(int i=0; i < S.length(); i++) {
			n[i] = S.charAt(i);
		}

		for(int i=2; i < N; i++) {
			if(n[i-2] == 'A' && n[i-1] == 'B' && n[i] == 'C') {
				cnt++;
			}
		}

			System.out.println(cnt);
	}
}