import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();
		char key = S.charAt(K-1);
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == key)
				ans.append(key);
			else
				ans.append("*");
		}
		System.out.println(ans);
	}

}