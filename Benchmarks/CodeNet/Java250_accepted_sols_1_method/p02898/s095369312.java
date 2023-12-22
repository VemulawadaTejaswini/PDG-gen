import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int k = s.nextInt();
			int ctr = 0;
			for(int i=0;i<n;i++) {
				int c = s.nextInt();
				if(c>=k)
					ctr++;
			}
			System.out.println(ctr);
	}
}