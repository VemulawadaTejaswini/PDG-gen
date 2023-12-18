import java.util.*;

public class Main{
    static double[] x,y;
    static int n;
    static int max;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();

	while(n!=0){
	    max = 1;
	    x = new double[n];
	    y = new double[n];

	    for(int i=0; i<n; i++){
		x[i] = sc.nextDouble();
		y[i] = sc.nextDouble();
	    }

	    solve();
	    System.out.println(max);

	    n = sc.nextInt();
	}
    }

   public static void solve(){
	for(int i=0; i<n; i++){
	    for(int j=i+1; j<n; j++){
		double ab = getDist(x[i],y[i],x[j],y[j]);
		if(ab<=2){
		    double mx = (x[i]+x[j])/2;//点aと点bの中点m
		    double my = (y[i]+y[j])/2;
		    double mc = Math.sqrt(1-(ab*ab)/4);//中点mから中心cまでの距離
		    double[][] nv = getNormalVector(x[i]-x[j],y[i]-y[j]);

		    int count = 0;
		    for(int l=0; l<2; l++){
			double cx = mx + nv[l][0]*mc;//中点cの座標
			double cy = my + nv[l][1]*mc;
			for(int k=0; k<n; k++){
			    if(getDist2(cx,cy,x[k],y[k])<1.0+(1e-6)){count++;}
			}
			if(count>max){max = count;}
			count = 0;
		    }
		}
	    }
	}
    }
    //a-bの絶対値（ab間の距離）
    public static double getDist(double x1,double y1,double x2,double y2){
	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

    //絶対値なしの比較用　絶対値取る処理は重いため
    public static double getDist2(double x1,double y1,double x2,double y2){
	return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
    }

    //単位法線ベクトルを求める
    public static double[][] getNormalVector(double x, double y){
	
	double d = Math.sqrt(x*x+y*y);//|a|
	
	double[][] nv = new double[2][2];
	
	nv[0][0] = -y/d;
	nv[0][1] = x/d;
	nv[1][0] = y/d;
	nv[1][1] = -x/d;
	
	return nv;
    }
}