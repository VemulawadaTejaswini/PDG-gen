import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		int n = S.length();
		int ans = 0;
		int i = n % 2 == 0 ? 2 : 1;
		for(;i < n;i+=2) {
			int len = (n - i) / 2;
			if(S.substring(0, len).equals(S.substring(len, n-i))) {
				ans = n - i;
				break;
			}
		}
		System.out.println(ans);
	}
}
