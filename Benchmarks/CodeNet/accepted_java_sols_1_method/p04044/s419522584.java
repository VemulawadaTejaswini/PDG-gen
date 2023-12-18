import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc042.contest.atcoder.jp/tasks/abc042_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String[] s = new String[N];
		for(int i=0; i<N; i++) s[i] = sc.next();
		sc.close();
		
		Arrays.sort(s);
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<N; i++){
			ans.append(s[i]);
		}
		
		System.out.println(ans);

	}

}
