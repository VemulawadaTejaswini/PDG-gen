/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main{
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);
    static StringTokenizer st;
    
    static String next()
        {
            while(st==null || !st.hasMoreElements()) 
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
    static float calcAngle(float h, float m) 
    { 
        // validate the input 
        if (h <0 || m < 0 || h >12 || m > 60) 
            System.out.println("Wrong input"); 
  
        if (h == 12) 
            h = 0; 
        if (m == 60)  
            m = 0; 
  
        // Calculate the angles moved by hour and minute hands 
        // with reference to 12:00 
        float hour_angle = (float)(0.5 * (h*60 + m)); 
        float minute_angle = (float)(6*m); 
  
        // Find the difference between two angles 
        float angle = (float)Math.abs(hour_angle - minute_angle); 
  
        // smaller angle of two possible angles 
        angle = (float)Math.min(360-angle, angle); 
  
        return angle; 
    } 
  
    // Function to find third side 
    static float third_side(float a,  
                    float b, float c) 
    { 
        float angle =(float) Math.cos((float)Math.toRadians(c));
          
        return (float)Math.sqrt((a * a) + 
            (b * b) - 2 * a * b * angle); 
} 
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	   
		  float a=Float.parseFloat(next());
		  float b=Float.parseFloat(next());
		  float h=Float.parseFloat(next());
		  float m=Float.parseFloat(next());
		  
		  float angle=calcAngle(h,m);
		  float side=third_side(a,b,angle);
		  System.out.printf("%.20f",side);
		      
		      
		    
	   }     
	catch(Exception e)
		 {}
	}
}
