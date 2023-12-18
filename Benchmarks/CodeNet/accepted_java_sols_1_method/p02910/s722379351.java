import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] s=S.toCharArray();
		int N = s.length;
		int count=0;
		
		for(int i=0;i<N;i+=2) {
			if(s[i]=='L') {
				count++;
			}
		}
		for(int i=1;i<N;i+=2) {
			if(s[i]=='R') {
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
