import java.util.*;

public class Main{
    int N,M,L,K,A,H;
    long[][] d;
    List<String> f;

    public static void main(String[] args){
	new Main().solve();
    }

    void solve(){
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	while(N!=0){
	    M = sc.nextInt();
	    L = sc.nextInt();
	    K = sc.nextInt();
	    A = sc.nextInt();
	    H = sc.nextInt();
	    f = new ArrayList<String>();
	    for(int i=0; i<L; i++){
		f.add(sc.nextInt()+"");
	    }
	    f.add(A+"");
	    f.add(H+"");
	    
	    d = new long[N][N];
	    for(int i=0; i<N; i++){Arrays.fill(d[i],Integer.MAX_VALUE);}
	    for(int i=0; i<K; i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();
		d[y][x] = t;
		d[x][y] = t;
	    }

	    for(int i=0; i<N; i++)d[i][i] = 0;

	    warshall_floyd();

	    for(int i=0; i<N; i++){
		for(int j=0; j<N; j++){
		    if(d[i][j]>M || !(f.contains(i+"") && f.contains(j+""))){
			d[i][j] = Integer.MAX_VALUE;
		    }
		}
	    }

	    warshall_floyd();

	    if(d[A][H]==Integer.MAX_VALUE){
		System.out.println("Help!");
	    }else{
		System.out.println(d[A][H]+Math.max(0,d[A][H]-M));
	    }

	    N = sc.nextInt();
	}
    }

    void warshall_floyd(){
	for(int k=0; k<N; k++)
	    for(int i=0; i<N; i++)
		for(int j=0; j<N; j++)d[i][j] = Math.min(d[i][j],d[i][k]+d[k][j]);
    }
}
	    