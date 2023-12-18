import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double a = Integer.parseInt(sc.nextLine());
	    double b = Integer.parseInt(sc.nextLine());
	    double h = Integer.parseInt(sc.nextLine());
	    double m = Integer.parseInt(sc.nextLine());
	    if(h==0){
	        h=12;
	    }
	    if(m==0){
	        m=60;
	    }
	    m=m/5;
	    double c=0;
	    c= a*a + b*b - 2*a*b*Math.cos(Math.toRadians(Math.abs(h-m)*30));
	    System.out.println(Math.sqrt(c));
	}
}
