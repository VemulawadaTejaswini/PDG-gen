import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String subs;
		int ans = 0;
		for(int i = 0; i<S.length();i++) {
			for(int j=i;j<=S.length();j++) {
				subs=S.substring(i, j);
				for(int k=0;k<subs.length();k++) {
					if(subs.charAt(k)!='A'&&subs.charAt(k)!='C'&&subs.charAt(k)!='G'&&subs.charAt(k)!='T') {
						break;
					}
					if(k==subs.length()-1) {
						ans=Math.max(ans, subs.length());
					}
				}
			}
		}
		System.out.println(ans);
	}

}
