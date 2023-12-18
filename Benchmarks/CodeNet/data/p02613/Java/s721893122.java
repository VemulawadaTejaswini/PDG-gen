/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ac = 0,wa=0,tle=0,re=0;
		for(int i=0;i<n;i++){
			String temp = in.next();
			if(temp.equals("AC")){
				ac++;
			}else if(temp.equals("WA")){
				wa++;
			}else if(temp.equals("TLE")){
				tle++;
			}else{
				re++;
			}
		}
		System.out.println("AC x "+ac);
		System.out.println("WA x "+wa);
		System.out.println("TLE x "+tle);
		System.out.println("RE x "+ re);// your code goes here
	}
}