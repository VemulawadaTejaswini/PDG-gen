import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    double a = kbd.nextDouble();
	    double b = kbd.nextDouble();
	    double c = kbd.nextDouble();
	    double d = kbd.nextDouble();
	    double e = kbd.nextDouble();
	    double f = kbd.nextDouble();
	    
	    double x = (e*c-f*b)/(a*e-b*d);
	    double y = (a*f-d*c)/(a*e-b*d);
	    if(x==0) x=0;
	    if(y==0) y=0;

	    System.out.printf("%.3f %.3f\n", x, y);
	}
    }
}

	    