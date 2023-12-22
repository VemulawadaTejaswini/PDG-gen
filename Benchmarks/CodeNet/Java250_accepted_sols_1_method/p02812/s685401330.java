import java.util.Scanner;

//AtCoder Beginner Contest 150
//B - Count ABC
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		String S = sc.next();
		sc.close();

		long ans = 0;
		for (int i = 0; i < S.length()-2; i++) {
			if (S.charAt(i) == 'A' && S.charAt(i+1) == 'B' && S.charAt(i+2) == 'C') {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
