import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		String ans = "";
		for (int i = 0; i < N; i++) {
			ans += S.substring(i, i + 1);
			ans += T.substring(i, i + 1);
		}
		System.out.println(ans);
	}
}