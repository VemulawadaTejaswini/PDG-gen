import java.util.*;

public class Main
{
    static final int inf = 99999;
    int[][] a;

    Main(){
	Scanner sc = new Scanner(System.in);
	int n, m, s, t;

	while(sc.hasNext()){
	    n = sc.nextInt();
	    a = new int[n+1][n+1];

	    for(int i = 0; i <= n; ++i)
		for(int j = i+1; j <= n; ++j)
		    a[i][j] = a[j][i] = inf;

	    for(int i = 0; i < n; ++i){
		s = sc.nextInt();
		m = sc.nextInt();
		for(int j = 0; j < m; ++j){
		    t = sc.nextInt();
		    a[s][t] = 1;
		}
	    }

	    for(int k = 1; k <= n; ++k)
		for(int i = 1; i <= n; ++i)
		    for(int j = 1; j <= n; ++j)
			a[i][j] = Math.min(a[i][j], a[i][k]+a[k][j]);

	    n = sc.nextInt();
	    for(int i = 0; i < n; ++i){
		s = sc.nextInt();
		t = sc.nextInt();
		m = sc.nextInt();
		if(a[s][t] < m)
		    System.out.println(Integer.toString(a[s][t]+1));
		else
		    System.out.println("NA");
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}