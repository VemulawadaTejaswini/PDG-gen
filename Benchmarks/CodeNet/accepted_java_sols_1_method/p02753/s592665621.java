import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int a =0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='A') {
				a++;
			}
		}
		if(a==0||a==3) {
			System.out.print("No");
		}else {
			System.out.print("Yes");
		}
	}
}
