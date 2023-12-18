import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int[] Enum = new int[N];
		int[] Wnum = new int[N];
		int ans = Integer.MAX_VALUE;
		if(S.charAt(0) == 'E')
			Enum[0] = 1;
		else
			Wnum[0] = 1;
		for(int i = 1; i < N; i++) {
			Enum[i] = Enum[i-1];
			Wnum[i] = Wnum[i-1];
			if(S.charAt(i) == 'E') {
				Enum[i] += 1;
			}
			else
				Wnum[i] += 1;
		}
		for(int i = 0; i < N-1; i++) {
			ans = Math.min(ans, Wnum[i] + Enum[N-1] - Enum[i+1]);
		}
		ans = Math.min(ans, Enum[N-1]-Enum[0]);
		ans = Math.min(ans, Wnum[N-2]);
		System.out.println(ans);
	}

}