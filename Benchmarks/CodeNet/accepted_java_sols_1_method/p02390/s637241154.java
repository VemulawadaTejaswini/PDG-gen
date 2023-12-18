/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
		int su = Integer.parseInt(br.readLine());//秒入力
		int h = su / 3600;
		int m = (su % 3600) / 60;
		int s = su - (3600 * h + m * 60);
		System.out.println(h+":"+m+":"+s);
	}
}
