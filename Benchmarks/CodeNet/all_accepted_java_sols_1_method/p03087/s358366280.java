import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Q = sc.nextInt();
		int[] cnt = new int[N + 1];
		String S = sc.next();
		for(int i = 1; i < N + 1; i++) {
			cnt[i] += cnt[i - 1];
			if(i - 2 >= 0 && S.charAt(i - 1) == 'C' && S.charAt(i - 2) == 'A') cnt[i]++;
		}
		for(int q = 0; q < Q; q++) {
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(cnt[r] - cnt[l]);
		}
	}
}