import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		int ans = 0;
		for(int i = 0; i < A.length(); i++) {
			if(A.substring(i, i + 1).equals(B.substring(i, i + 1)) && C.substring(i, i + 1).equals(B.substring(i, i + 1))) {
				
			} else if(A.substring(i, i + 1).equals(B.substring(i, i + 1)) || C.substring(i, i + 1).equals(B.substring(i, i + 1)) || C.substring(i, i + 1).equals(A.substring(i, i + 1))) {
				ans++;
			} else {
				ans += 2;
			}
		}
		System.out.println(ans);
	}
}
