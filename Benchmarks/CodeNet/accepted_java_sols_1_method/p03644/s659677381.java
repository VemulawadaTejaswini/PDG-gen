import java.util.Scanner;

/**
 * http://abc068.contest.atcoder.jp/tasks/abc068_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.close();
		
		int[] candidates = {2,4,8,16,32,64};
		int ans = 1;
		for(int c:candidates){
			if(c<=N){
				ans = c;
			}
		}
		
		System.out.println(ans);
		
		
	}

}