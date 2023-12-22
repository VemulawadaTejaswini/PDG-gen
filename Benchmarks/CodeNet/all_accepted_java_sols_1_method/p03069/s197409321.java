import java.util.Scanner;
import java.util.Arrays;

public class Main {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		int cnt = 0;

		int b = 0;
		int w = 0;
		for (int i = N-1; i>=0; i--) {
			if (S.charAt(i) == '#') {
				b++;
			}
			else
				w++;
			if (b >= w) {
				cnt += w;
				w = 0;
				b = 0;
				
			}
		}
		cnt += b;

		System.out.println(cnt);
	}
}	