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
	    double y = (f-d*x)/e;


	    System.out.printf("%.3f %.3f\n", x, y);
	}
    }
}

	    