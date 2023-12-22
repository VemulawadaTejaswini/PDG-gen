import java.util.Scanner;

/**
 * https://abc065.contest.atcoder.jp/tasks/abc065_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) a[i] = sc.nextInt()-1;
		sc.close();
		
		boolean[] dp = new boolean[N];
		int i=0;
		int ans = 0;
		boolean f = false;
		while(!dp[i]){
			dp[i] = true;
			if(i==1){
				f = true;
				break;
			}else{
				ans++;
				i = a[i];
			}
		}
		
		System.out.println(f ? ans : -1);
	}

}
