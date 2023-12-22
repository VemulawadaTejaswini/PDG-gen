import java.util.Scanner;

/**
 * https://abc064.contest.atcoder.jp/tasks/abc064_c
 */
public class Main {

	public static void main(String[] args) {
		
		int[] kind = new int[9];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int c = sc.nextInt();
			kind[Math.min(8,c/400)]++;
		}
		sc.close();
		
		int ans = 0;
		for(int i=0; i<8; i++){
			if(kind[i]>0){
				ans++;
			}
		}		
		int min = Math.max(1, ans);
		int max = ans+kind[8];
		System.out.println(String.format("%d %d", min, max));

	}

}
