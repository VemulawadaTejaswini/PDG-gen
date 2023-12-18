import java.util.*;

public class C2005{

    int n;
    int hx,hy,dx,dy;
    int[] x,y;
    double[][] distY;
    double[] distM;
    int[] collect;
    boolean can;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    n = sc.nextInt();
	    hx = sc.nextInt();
	    hy = sc.nextInt();
	    dx = sc.nextInt();
	    dy = sc.nextInt();
	    if(n==0 && hx==0 && hy==0 && dx==0 && dy==0) break;
	    x = new int[n];
	    y = new int[n];
	    for(int i=0; i<n; i++){
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
	    }
	    
	    distY = new double[n+1][n+1];
	    distM = new double[n];
	    for(int i=0; i<n; i++){
		double dist = Math.sqrt((hx-x[i])*(hx-x[i])+(hy-y[i])*(hy-y[i]));
		distY[0][i+1] = dist;
		distY[i+1][0] = dist;
		dist = Math.sqrt((dx-x[i])*(dx-x[i])+(dy-y[i])*(dy-y[i]));
		distM[i] = dist;
	    }
	    for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
		    double dist = Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
		    distY[i+1][j+1] = dist;
		    distY[j+1][i+1] = dist;
		}
	    }

	    collect = new int[n];
	    can = false;
	    dfs(0,0,0);
	    
	    if(can){
		System.out.println("YES");
	    }else{
		System.out.println("NO");
	    }
	}
    }

    void dfs(int point, int cnt, double d){
	if(can) return;
	if(cnt==n){
	    can = true;
	    return;
	}

	for(int i=0; i<n; i++){
	    if(collect[i]==0){
		if(d>=distM[i]){
		    return;
		}
	    }
	}

	for(int i=0; i<n; i++){
	    if(collect[i]==0){
		double newD = d+distY[point][i+1];
		if(newD>=distM[i]) continue;
		collect[i] = 1;
		dfs(i+1, cnt+1, newD);
		collect[i] = 0;
	    }
	}
    }

    public static void main(String[] args){
	new C2005().solve();
    }
}