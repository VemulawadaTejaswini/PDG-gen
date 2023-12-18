import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		int K = Integer.parseInt(in.next());
		int ans = 1;
		for(int i = 0; i < N; i++){
			if(ans + K < ans * 2)ans += K;
			else ans += ans;
		}
		System.out.println(ans);
	}
}