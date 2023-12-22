import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = new char[2];
		int T = 0;
		for(int i = 0;i<s.length();i++) {
			char cc = s.charAt(i);
			if(i == 0) {
				c[i] = cc;
				continue;
			}
			if(c[0]==cc)continue;
			if(c[1]==cc)continue;
			if(c[0]!=cc && T == 0) {
				c[1] =cc;
				T++;
			}else {
				T = 2;
				break;
			}
		}
		if(T == 2 || T == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
	}
	

}
