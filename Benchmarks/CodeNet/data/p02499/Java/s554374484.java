import java.util.Scanner;
public class Main {
	static char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static char[] b = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static char[] c = {'0','1','2','3','4','5','6','7','8','9'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String tmp = stdIn.nextLine();
		int[] k = new int[a.length];
		tmp = tmp.toLowerCase();
		for(int i = 0; i < tmp.length(); i++) {
			for(int j = 0; j < a.length; j++) {
				if(tmp.charAt(i) == a[j]) {
					k[j]++;
					break;
				}
			}
		}
		
		for(int i = 0; i < k.length; i++) {
			System.out.println(a[i]+" : " + k[i]);
		}
	}
	
}