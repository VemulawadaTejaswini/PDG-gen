import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		String T=sc.next();
		sc.close();
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		int count=0;
		for(int i=0;i<S.length();i++) {
			if(s[i]!=t[i])
				count++;
		}
		System.out.println(count);
	}
}
