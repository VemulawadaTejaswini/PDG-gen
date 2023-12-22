import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		long[] ans = new long[N+1];
		ans[0] = 2;
		ans[1] = 1;
		for(int i = 2; i <= N; i++)ans[i] = ans[i-1] + ans[i-2];
		System.out.println(ans[N]);
	}
}