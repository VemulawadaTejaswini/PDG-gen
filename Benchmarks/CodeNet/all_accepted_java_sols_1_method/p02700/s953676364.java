/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		long a=s.nextLong();
		long b=s.nextLong();
		long c=s.nextLong();
		long d=s.nextLong();
		while(a>0 && c>0)
		{c-=b;
		if(c<=0)
		break;
		a-=d;}
		if(a>0)
		System.out.println("Yes");
		else
		System.out.println("No");
		
	}
}
		
		
		   