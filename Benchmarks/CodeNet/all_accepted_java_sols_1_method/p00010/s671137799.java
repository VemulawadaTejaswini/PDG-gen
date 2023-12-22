import java.util.*;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){
	    double[] x = new double[3];
	    double[] y = new double[3];
	    for(int i=0; i<3; i++){
		x[i] = sc.nextDouble();
		y[i] = sc.nextDouble();
	    }

	    double A1,A2,B1,B2,C1,C2,X,Y;
	    A1=2*(x[1]-x[0]);
	    B1=2*(y[1]-y[0]);
	    C1=x[0]*x[0]-x[1]*x[1]+y[0]*y[0]-y[1]*y[1];
	    A2=2*(x[2]-x[0]);
	    B2=2*(y[2]-y[0]);
	    C2=x[0]*x[0]-x[2]*x[2]+y[0]*y[0]-y[2]*y[2];
	    X=(B1*C2-B2*C1)/(A1*B2-A2*B1);
	    Y=(C1*A2-C2*A1)/(A1*B2-A2*B1);

	    double r = Math.sqrt((X-x[0])*(X-x[0])+(Y-y[0])*(Y-y[0]));
	    BigDecimal bi = new BigDecimal(String.valueOf(X));
	    X = bi.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
	    bi = new BigDecimal(String.valueOf(Y));
	    Y = bi.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
	    bi = new BigDecimal(String.valueOf(r));
	    r = bi.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
	    
	    System.out.printf("%.3f",X);
	    System.out.print(" ");
	    System.out.printf("%.3f",Y);
	    System.out.print(" ");
	    System.out.printf("%.3f",r);
	    System.out.println();
	    n--;
	}
    }
}