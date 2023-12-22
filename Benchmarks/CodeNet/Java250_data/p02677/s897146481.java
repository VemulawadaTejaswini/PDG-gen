/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;


/* Name of the class has to be "Main" only if the class is public. */
public class Main
 
 
{
    static Scanner in = new Scanner(System.in);
   
    public static void solve()
    {
        DecimalFormat df = new DecimalFormat("#.####################");
        double a=in.nextDouble(),b=in.nextDouble();
        double h=in.nextDouble(),m=in.nextDouble();
        
        
        double angle=Math.abs(30*h - 11*m/2.0);
        
       double ans=Math.toRadians(angle);
      // System.out.println(ans);
        
        double c= Math.sqrt(a*a + b*b - 2.0*a*b*Math.cos(ans));
        
        System.out.println(df.format(c));
        
    }
    

    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t=1;
		//in.nextLine();
		
		while(t>0)
		{
		    
		    solve();
		    t--;
		}
		
		
	
	//	System.out.println(x);
	}
}
