/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = System.in.read(); 
		int as = 0;
		int bs = 0;
		
		for (int i=0; i<n ;i++){
			String tmp = System.in.read();
			String[] buf = tmp.split(" ");
			int a = Integer.parseInt(buf[0]);
			int b = Integer.parseInt(buf[1]);
			
			if ( a > b ){
				as += a + b;
			}else if (a < b){
				bs += a + b;
			}else{
				as += a;
				bs += b;
			}
			
		}
		
		System.out.println(as + " " + bs);
		
	}
}