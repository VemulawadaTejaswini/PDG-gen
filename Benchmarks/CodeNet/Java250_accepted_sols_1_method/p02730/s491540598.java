import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		boolean flag = true;
		for(int i = 0; i < n/2; i++) {
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				flag = false;
			}
		}

		String fstr = str.substring(0,(n-1)/2);
		for(int i = 0; i < fstr.length()/2; i++) {
			if(fstr.charAt(i)!=fstr.charAt(fstr.length()-1-i)) {
				flag = false;
			}
		}

		String lstr = str.substring((n+3)/2-1,n);
		for(int i = 0; i <lstr.length()/2; i++) {
			if(lstr.charAt(i)!=lstr.charAt(lstr.length()-1-i)) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
