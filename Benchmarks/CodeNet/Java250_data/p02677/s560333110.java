import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Main
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    int A=scan.nextInt();
	    int B=scan.nextInt();
	    int H=scan.nextInt();
	    int M=scan.nextInt();
	    double mangle = (360.0/60.0)*M;
	    double hangle = (30.0*H)+(30.0/360.0)*mangle;
	    double angle = Math.abs(mangle-hangle);
	    if(angle>180) angle= 360-angle;
	    double ans = A*A+B*B-2*A*B*Math.cos(angle*(Math.PI/180));
	    ans = Math.sqrt(ans);
	    System.out.println(ans);
	}
}