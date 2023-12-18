import java.util.*;

public class Main{
    static long N;
    static int A,B,C,D;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int t=0;t<T;t++){
	    N = sc.nextLong();
	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();
	    int count = D;
	    int now = 1;

	    int co = solve(count,now);
	    if(co < ans) ans=co;
	    System.out.println(ans);
	}
    }
    public static int solve(int count,int now){
	if(now > N) return Integer.MAX_VALUE;
	if(now == N) return count;
	if(count >= ans) return Integer.MAX_VALUE;

	if(now*2*3*5 >= N){
	    count = count+A+B+C;
	    now = now*2*3*5;
	    solve(count,now);
	}
	if(now*2*3 <= N) solve(count+A+B,now*2*3);

	if(now*5 <= N) solve(count+C,now*5);

	if(now*3 <= N) solve(count+B,now*3);

	if(now*2 <= N) solve(count+A,now*2);

	

	
	if(now*2 < N){
	    solve(count+A,now*2);
	    solve(count+B,now*3);
	    solve(count+C,now*5);
	}
	if(N < now*2 && Math.abs(N-now)<Math.abs(N-now*2)){
	    solve(count+D,now+1);
	}
	if(N < now*2 && Math.abs(N-now)>Math.abs(N-now*2)){
	    solve(count+D,now-1);
	}
	return Integer.MAX_VALUE;
    }
}
