import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		int len = S.length();
		int cnt = 0;
		for(int i=0;i<len/2;i++) {
			if(S.charAt(i)==S.charAt(len-1-i))continue;
			cnt++;
		}
		System.out.println(cnt);
	}
}
