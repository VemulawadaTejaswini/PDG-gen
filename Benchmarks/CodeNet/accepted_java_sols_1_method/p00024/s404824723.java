import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			double v1= Double.parseDouble(line);
			double v2=0;
			double y;
			int k=0;
			while(v2 < v1){
				k++;
				y=5*k-5;
				v2=9.8*Math.sqrt(y/4.9);
			}
			System.out.println(k);
		}
	}
}	
		