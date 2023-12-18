import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	double[] x = new double[4];
	double[] y = new double[5];
	double a1,a2;
	for(int j=0;j<n;j++){
	    for(int i=0;i<4;i++){
		x[i]=s.nextDouble();
		y[i]=s.nextDouble();
	    }
	    a1=(y[1]-y[0])/(x[1]-x[0]);
	    a2=(y[3]-y[2])/(x[3]-x[2]);
	    if(a1==a2)
		System.out.println("YES");
	    else
		System.out.println("NO");
	}
    }
}