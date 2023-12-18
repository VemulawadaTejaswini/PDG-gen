import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){
	    double[] x = new double[2];
	    double[] y = new double[2];
	    double[] r = new double[2];
	    for(int i=0; i<2; i++){
		x[i] = sc.nextDouble();
		y[i] = sc.nextDouble();
		r[i] = sc.nextDouble();
	    }

	    double dist = (x[0]-x[1])*(x[0]-x[1])+(y[0]-y[1])*(y[0]-y[1]);
	    double sr = (r[0]+r[1])*(r[0]+r[1]);
	    double dr = (r[0]-r[1])*(r[0]-r[1]);

	    int ans = 0;
	    if(dist>sr){ans = 0;}
	    else if(dist<sr && dr<dist){ans = 1;}
	    else if(dr>dist){
		if(r[0]>r[1]){ans = 2;}
		else {ans = -2;}
	    }
	    else{ans = 1;}
	    
	    System.out.println(ans);
	    n--;
	}
    }
}