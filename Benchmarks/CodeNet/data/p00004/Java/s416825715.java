import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	double a=scan.nextDouble();
        	Double b=scan.nextDouble();
        	Double c=scan.nextDouble();
        	Double d=scan.nextDouble();
        	Double e=scan.nextDouble();
        	Double f=scan.nextDouble();
        	Double x,y;
        	x =(e*c-b*f)/(a*e-b*d);
        	y =(-d*c+a*f)/(a*e-b*d);
        	if(x==0)x=0.;
        	if(y==0)y=0.;
        	System.out.printf("%.3f %.3f\n",x,y);
        }
    }
}