import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		String S = sc.next();
		long ans = 0;
		if(P == 2 || P == 5) {
			for(int i = N-1; i >= 0; i--) {
				int x = Character.getNumericValue(S.charAt(i));
				if(x % P == 0)
					ans += i + 1;
			}
		}
		else{
			int[] c = new int[P];
			c[0] = 1;
			int a = 0, digit = 1;
			for(int i = N-1; i >= 0; i--) {
				int x = Character.getNumericValue(S.charAt(i));
				a = (a + x * digit) % P;
				ans += c[a];
				c[a]++;
				digit = digit * 10 % P;
			}
		}
		System.out.println(ans);

	}

}