import java.util.Scanner;
public class Main {
	static char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static char[] b = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String tmp = stdIn.nextLine();
		String ans = "";
		IN:for(int i = 0; i < tmp.length(); i++) {
			for(int j = 0; j < a.length; j++) {
				if(tmp.charAt(i) == a[j]) {
					ans += String.valueOf(b[j]);
					continue IN;
				}
				else if(tmp.charAt(i) == b[j]) {
					ans += String.valueOf(a[j]);
					continue IN;
				}
			}
			ans += String.valueOf(tmp.charAt(i));
		}
		System.out.println(ans);
	}
	
}