import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] s=S.toCharArray();
		int N=S.length();
		int count=0;
		
		for(int i=0;i<N/2;i++) {
			if(s[i]!=s[N-(i+1)]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
