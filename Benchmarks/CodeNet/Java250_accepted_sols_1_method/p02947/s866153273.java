import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_C
		Scanner sc = new Scanner(System.in);
		Long ans = (long) 0;

		int N = sc.nextInt();
		String S[] = new String[N];
		char SWK[] = new char[11];

		sc.nextLine();
		for(int i=0; i<N; i++) {
			SWK = sc.nextLine().toCharArray();
			Arrays.sort(SWK);
			S[i] = new String(SWK);

		}

		Arrays.sort(S);

		String nowS = "";
		int indS = 0;

		for(int i=0; i<N; i++) {
			if(nowS.equals(S[i])) {
				ans += (i-indS);
			} else {
				nowS = S[i];
				indS = i;
			}
		}

		System.out.println(ans);

		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}