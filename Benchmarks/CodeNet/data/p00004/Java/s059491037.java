import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){

	while(kbd.hasNext()){
	    double a = kbd.nextInt();
	    double b = kbd.nextInt();
	    double c = kbd.nextInt(); 
	    double d = kbd.nextInt();
	    double e = kbd.nextInt();
	    double f = kbd.nextInt();

	    double x = (e*c-f*b)/(a*e-b*d);
	    double y = (f/e) - (d*(e*c-f*b))/(a*e-b*d);

	    System.out.println(x+" "+y);
	}
    }
}