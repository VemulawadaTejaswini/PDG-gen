import java.util.*;
import java.lang.*;
import java.io.*;

class Main{


      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

       

	while(true)
	    {

		double R = Double.parseDouble(in.readLine());	
		
		if(R == 0.0)
		    break;	

		double denominator,numerator;
		denominator = numerator = 1.0;

		while(Math.abs(Math.PI - numerator/denominator) > R)
		    {
		
			if(numerator/denominator >=  Math.PI)
			    {
				numerator = 1.0;
				denominator++;
			    }
			else
			    {
				numerator++;	
			    }
		    }
		System.out.println((int)numerator + "/" + (int)denominator);
	    }

    }
    
}