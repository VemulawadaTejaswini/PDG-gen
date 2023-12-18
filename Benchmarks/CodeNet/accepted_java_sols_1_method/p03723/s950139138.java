import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();

		if(A == B && B == C && A%2 == 0 && B%2 == 0 && C%2 == 0) {
			System.out.println("-1");
			return;
		}
		long ans = 0;
		long tmpA = A;
		long tmpB = B;
		long tmpC = C;
		while(true) {
			if(tmpA%2 != 0 || tmpB%2 != 0 || tmpC%2 != 0) {
				break;
			}
			ans++;
			long tmpAbk = tmpA;
			long tmpBbk = tmpB;
			long tmpCbk = tmpC;
			tmpA = tmpBbk/2 + tmpCbk/2;
			tmpB = tmpAbk/2 + tmpCbk/2;
			tmpC = tmpAbk/2 + tmpBbk/2;
		}
		System.out.println(ans);
	}
}