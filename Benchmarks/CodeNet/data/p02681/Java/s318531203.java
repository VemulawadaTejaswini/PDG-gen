import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int N=S.length();
		int count=0;
		
		char[] s=S.toCharArray();
		char[] t=T.toCharArray();
		
		for(int i=0;i<N;i++) {
			if(s[i]!=t[i]) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
