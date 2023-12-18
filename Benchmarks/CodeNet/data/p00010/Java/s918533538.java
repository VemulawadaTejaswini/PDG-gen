import java.util.*;

public class Main {
    public static double x1,x2,y1,y2,x3,y3,a,b,c,a1,b1,c1,xp,yp;
  	static double z(double z1, double z2, double z3, double z4){
        return Math.sqrt(Math.pow(z3-z1, 2) + Math.pow(z4-z2, 2));
  	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNextInt()){
    		int n=sc.nextInt();
    		for(int i=0;i<n;i++){
    			  x1=sc.nextDouble();
    	          y1=sc.nextDouble();
    	          x2=sc.nextDouble();
    	          y2=sc.nextDouble();
    	          x3=sc.nextDouble();
    	          y3=sc.nextDouble();
    	          a=2*(x2-x1);
    	          a1=2*(x3-x1);
    	          b=2*(y2-y1);
    	          b1=2*(y3-y1);
    	          c=Math.pow(x1,2)-Math.pow(x2,2)+Math.pow(y1,2)-Math.pow(y2,2);
    	          c1=Math.pow(x1,2)-Math.pow(x3,2)+Math.pow(y1,2)-Math.pow(y3,2);
    	          xp=(b*c1-b1*c)/(a*b1-a1*b);
    	          yp=(c*a1-c1*a)/(a*b1-a1*b);
    	          System.out.printf("%.3f %.3f %3f\n",xp,yp,z(x1,y1,xp,yp));
    		}
    	}
    }
  
}