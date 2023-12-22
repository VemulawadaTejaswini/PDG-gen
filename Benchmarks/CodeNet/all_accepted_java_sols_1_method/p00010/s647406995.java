import java.util.*;
public class Main {
	static Scanner sc=new Scanner(System.in);
    static int N;
    public static void main(String[] args) {
        N = sc.nextInt();
        double[] x=new double[3],y=new double[3];
        for(int i=0;i<N;i++) {
            for(int j=0;j<3;j++){
                x[j]=sc.nextDouble();
                y[j]=sc.nextDouble();
            }
            double a=Math.hypot(x[0]-x[1],y[0]-y[1]),
            	   b=Math.hypot(x[1]-x[2],y[1]-y[2]),
                   c=Math.hypot(x[2]-x[0],y[2]-y[0]),
                   R=a*b*c/(Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))),
            	   aA=Math.acos((b*b+c*c-a*a)/(2.0*b*c)),
            	   aB=Math.acos((c*c+a*a-b*b)/(2.0*c*a)),
            	   aC=Math.acos((a*a+b*b-c*c)/(2.0*a*b)),
            	   A=Math.sin(2.0*aA),
                   B=Math.sin(2.0*aB),
                   C=Math.sin(2.0*aC),
                   xp=((x[2]*A+x[0]*B+x[1]*C)/(A+B+C)),
                   yp=((y[2]*A+y[0]*B+y[1]*C)/(A+B+C));
            	   System.out.printf("%.3f %.3f %.3f\n",xp,yp,R);
        }
    }
}