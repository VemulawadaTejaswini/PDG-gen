import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String nn = stdIn.next();
		int n = Integer.parseInt(nn); //n個の文字列
		char[][] s = new char[n][10];
		String[] moji = new String[n];

		for(int i = 0; i < n; i++) {
			s[i] = stdIn.next().toCharArray();
			Arrays.sort(s[i]);
		}

		for(int i = 0; i < n; i++) {
			moji[i] = String.valueOf(s[i]);
		}
		
		Arrays.sort(moji);

		long cnt = 0;
		long shikoi = 0;
		for(int i = 0; i < n-1; i++) {
			if(moji[i].equals(moji[i+1])) {
				shikoi++;
				cnt += shikoi;
			}else {
				shikoi = 0;
			}
		}
		System.out.println(cnt);

	}

}
