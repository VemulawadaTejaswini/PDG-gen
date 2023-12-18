import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		char c = ' ';

		for(int i=0;i<S.length();i=i+2) {
			c=S.charAt(i);
			if(c!='R'&&c!='U'&&c!='D') {
				System.out.println("No");
				return;
			}
		}
		for(int k=1;k<S.length();k=k+2) {
			c=S.charAt(k);
			if(c!='L'&&c!='U'&&c!='D') {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
