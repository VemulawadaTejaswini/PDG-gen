import java.util.Scanner;

/**
 * https://abc076.contest.atcoder.jp/tasks/abc076_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		long ans = 1;
		for(int i=0; i<N; i++){
			ans = Math.min(ans+K, ans*2);
		}
		
		System.out.println(ans);

	}

}
