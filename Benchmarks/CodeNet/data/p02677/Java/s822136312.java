import java.util.*;
 
import java.io.*;
 
public class Main{
    
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        double A = s.nextDouble();
        double B = s.nextDouble();
        double H = s.nextDouble();
        double M = s.nextDouble();
        double arg = Math.abs(6.0*M/180.0 - (30.0*H + (M/60)*30)/180.0);
        double A2 = Math.pow(A, 2);
        double B2 = Math.pow(B, 2);
        System.out.println(Math.sqrt(A2 + B2 - 2*A*B*Math.cos(arg*Math.PI)));
        
        

 
	}
} 