import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for (int i=0;i<(S.length()-1)/2;i++) {
			if (S.charAt(i)!=S.charAt(S.length()-1-i)||S.charAt(i)!=S.charAt(S.length()-1-i)) {
				System.out.println("No");
				return ;
			}
		}
		for (int i=(S.length()+3)/2-1;i<S.length();i++) {
			if (S.charAt(i)!=S.charAt(S.length()-1-i+(S.length()+3)/2-1)) {
				System.out.println("No");
				return ;
			}
		}
		System.out.println("Yes");
	}

}
