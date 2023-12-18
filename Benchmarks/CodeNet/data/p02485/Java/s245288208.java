import java.util.Scanner;
public class Main {
	static char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static char[] b = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static char[] c = {'0','1','2','3','4','5','6','7','8','9'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			String tmp = String.valueOf(n);
			if(n == 0) {
				break;
			}
			int ans = 0;
			for(int i = 0; i < tmp.length(); i++) {
				for(int j = 0; j < c.length; j++) {
					if(tmp.charAt(i) == c[j]) {
						ans += j;
					}
				}
			}
			System.out.println(ans);
		}
	}
	
}