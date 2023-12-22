import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int M = Integer.parseInt(sc.next());
	int[] cost = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	int[] a = new int[M];
	int[] zantei = new int[N+1];
	for(int i = 0; i<N; i++) {
	    zantei[i] = Integer.MIN_VALUE;
	}
	for(int i = 0; i<M; i++) {
	    a[i] = Integer.parseInt(sc.next());
	}
	zantei[0] = 0;
	for(int i = 0; i<N+1; i++) {
	    for(int j = 0; j<M; j++) {
		if(i>=cost[a[j]]) {
		    zantei[i] = Math.max(zantei[i-cost[a[j]]]+1, zantei[i]);
		}
	    }
	}
	//	System.out.println(zantei[N]);
	StringBuilder sb = new StringBuilder();
	int cnt = N;
	for(int i = zantei[N]; i>0; i--) {
	    int x = 0;
	    for(int j = 0; j<M; j++) {
		if(cnt>=cost[a[j]]) {
		    if( zantei[cnt-cost[a[j]]] == i-1) {
			x = Math.max(a[j],x);
		    }
		}
            }
	    sb.append(x);
	    cnt = cnt - cost[x];
	    //  System.out.println("cnt: "+ cnt + " " + x + " " + cost[x]);
	}
	System.out.println(sb.toString());

    }
}