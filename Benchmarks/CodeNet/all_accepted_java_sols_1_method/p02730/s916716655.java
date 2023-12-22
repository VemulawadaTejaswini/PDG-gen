import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "Yes" ;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)!=S.charAt(S.length()-1-i)) {
				ans = "No";
			}
		}
		for(int i=0;i<(S.length()-1)/2;i++) {
			if(S.charAt(i)!=S.charAt((S.length()-1)/2-1-i)) {
				ans = "No";
			}
		}
		System.out.println(ans);
	}

}