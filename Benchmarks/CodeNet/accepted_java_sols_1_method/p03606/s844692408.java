import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc073/tasks/abc073_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int ans = 0;
		for(int i=0; i<N; i++){
			ans += -(sc.nextInt()-sc.nextInt())+1;
		}
		sc.close();
		
		System.out.println(ans);

	}

}