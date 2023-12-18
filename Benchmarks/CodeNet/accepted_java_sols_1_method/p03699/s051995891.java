import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] S = new int[N];
		int ans = 0;
		for(int i = 0;i < N;i++) {
			S[i] = scn.nextInt();
			ans+=S[i];
		}
		Arrays.sort(S);
		int c = 0;
		while(ans %10==0 && c<N) {
			if(c == 0) {
				ans -= S[c];
			}else {
				ans+=S[c-1];
				ans-=S[c];
			}
			c++;
		}
		System.out.println(ans%10==0?0:ans);
	}

}
