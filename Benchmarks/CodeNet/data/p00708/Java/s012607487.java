import java.util.*;

class Main{
    static int n;
    static double[] x,y,z,r;
    static double min;
    static double[][] cost;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();

	while(n!=0){
	    x = new double[n];
	    y = new double[n]; 
	    z = new double[n];
	    r = new double[n];
	    for(int i=0; i<n; i++){
		x[i] = sc.nextDouble();
		y[i] = sc.nextDouble();
		z[i] = sc.nextDouble();
		r[i] = sc.nextDouble();
	    }

	    min = Double.MAX_VALUE;
	    solve();
	    if(min==Double.MAX_VALUE){min=0.000;}
	    System.out.printf("%1.3f",min);
	    System.out.println();

	    n = sc.nextInt();
	}
    }

    public static void solve(){
	cost = new double[n][n];
	for(int i=0; i<n; i++){
	    for(int j=i+1; j<n; j++){
		cost[i][j] = getDistance(i,j);
		if(cost[i][j]<0)cost[i][j]=0.0;
	    }
	}

	min = getMin();
    }

    public static double getDistance(int i, int j){
	return Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])+(z[i]-z[j])*(z[i]-z[j]))-r[i]-r[j];
    }

    public static double getMin(){
	double[] mincost = new double[n];
	boolean[] used = new boolean[n];
	for(int i=0; i<n; i++){
	    mincost[i] = 1000000000;
	    used[i] = false;
	}
	mincost[0] = 0;
	double res = 0;

	while(true){
	    int v = -1;
	    for(int i=0; i<n; i++){
		if(!used[i] && (v==-1 || (mincost[i]<mincost[v]))){v = i;}
	    }

	    if(v==-1)break;
	    used[v] = true;
	    res += mincost[v];

	    for(int i=0; i<n; i++){
		mincost[i] = mincost[i];
		if(mincost[i]>cost[v][i]){mincost[i]=cost[v][i];}
	    }
	}
	return res;
    }
}