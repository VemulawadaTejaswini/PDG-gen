import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
      	double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
      	double h = Double.parseDouble(sc.next());
      	double m = Double.parseDouble(sc.next());
        
      	h = 2*Math.PI*h/12 + 2*Math.PI*m/720;
      	m = 2*Math.PI*m/60;
      
      	if (Math.abs(h - m) > Math.PI) h = 2*Math.PI - Math.abs(h - m);
      	else h = Math.abs(h - m);
      	
      	double result = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(h));
      	System.out.println(result);
    }
}