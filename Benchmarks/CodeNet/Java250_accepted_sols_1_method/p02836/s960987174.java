import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		char s[] = S.toCharArray();

		//文字の長さ
		int N = S.length();

		int count = 0;

		for(int i = 0; i< N; i++)
		{
			
			// S = abcdefgdcba N = 11
			// S[0]とS[10]比較 a == a
			// S[1]とS[9]比較 b == b
          	// ....S[4]とS[6]比較 e != g
 			if(s[i] != s[N - 1-i]) {
				count++;
			}
		}
		System.out.println(count/2);


	}
}