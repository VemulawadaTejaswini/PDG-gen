import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){
	    double[] x = new double[4];
	    double[] y = new double[4];
	    for(int i=0; i<x.length; i++){
		x[i] = sc.nextDouble();
		y[i] = sc.nextDouble();
	    }

	    x[1] -= x[0];
	    y[1] -= y[0];
	    x[3] -= x[2];
	    y[3] -= y[2];
	    String ans = "NO";
	    if(x[1]*y[3]-x[3]*y[1]==0){ans = "YES";}

	    System.out.println(ans);
	    n--;
	}
    }
}