import java.util.*;

class Main{
    static int n;
    static double[] x,y,z,r;
    static double[][] dist;
    static int[] list;
    static double min;
    static int needCor;

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
	dist = new double[n][n];
	int link = 0;
	list = new int[n];
	int type = 1;
	for(int i=0; i<n; i++){
	    for(int j=i+1; j<n; j++){
		dist[i][j] = getDistance(i,j);
		//System.out.println(dist[i][j]);
		if(dist[i][j]<0){
		    link++;
		    list[i] = type;
		    list[j] = type;
		    type++;
		}
	    }
	}

	needCor = n-link-1;
	int[][] field = new int[n][n];
	getMin(0,field);
    }

    public static double getDistance(int i, int j){
	return Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])+(z[i]-z[j])*(z[i]-z[j]))-r[i]-r[j];
    }

    public static void getMin(int colNum, int[][] field){
	//System.out.println(needCor+" "+colNum);
	if(colNum>needCor){return;}
	if(colNum==needCor){
	    int[] record = new int[n];
	    double[] distRecord = new double[needCor];
	    int count = 0;
	    for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
		    if(field[i][j]==1){
			distRecord[count] = dist[i][j];
			//System.out.println(distRecord[count]);
			if(distRecord[count]<=0){return;}
			count++;
			record[i] = 1;
			record[j] = 1;
			int linkNum1 = list[i];
			int linkNum2 = list[j];
			for(int k=0; k<n; k++){
			    if(list[k]==linkNum1 || list[k]==linkNum2){record[k] = 1;}
			}
		    }
		}
	    }
	    for(int i=0; i<n; i++){
		if(record[i]==0){return;}
	    }
	    //System.out.println(Arrays.toString(distRecord));
	    double sum = 0;
	    for(int j=0; j<needCor; j++){
		if(distRecord[j]<=0){return;}
		sum += distRecord[j];
	    }
	    if(sum<min){min = sum; return;}
	    else{return;}	    
	}

	for(int i=0; i<n; i++){
	    for(int j=i+1; j<n; j++){
		field[i][j]  = 1;
		getMin(colNum+1, field);
		field[i][j] = 0;
	    }
	}

    }
}