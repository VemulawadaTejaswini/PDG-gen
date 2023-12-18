import java.util.*;

public class Main {

	int N, M, r;
	int[] ts, ns, ms, ss;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			M = in.nextInt();
			r = in.nextInt();
			ts = new int[r];
			ns = new int[r];
			ms = new int[r];
			ss = new int[r];
			for(int i=0; i<r; i++){
				ts[i] = in.nextInt();
				ns[i] = in.nextInt();
				ms[i] = in.nextInt();
				ss[i] = in.nextInt();
			}
			int q = in.nextInt();
			for(int i=0; i<q; i++){
				int start = in.nextInt(),
					end = in.nextInt(),
					m = in.nextInt();
				System.out.println(solve(start, end, m));
			}
		}
	}

	int solve(int start, int end, int m){
		int[] accum = new int[1300];
		for(int i=0; i<r; i++)if(ms[i] == m){
			if(ss[i] == 1) accum[ts[i]]++;
			else accum[ts[i]]--;
		}
		for(int t=1; t<1300; t++)
			accum[t] = accum[t] + accum[t-1];
		int ans = 0;
		for(int t=start; t<end; t++)
			if(accum[t] > 0) ans++;
		return ans;
	}

	public static void main(String args[]){
		new Main().run();
	}
}