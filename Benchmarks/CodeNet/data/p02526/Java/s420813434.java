/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	private static int[] parseIntAll(String[] strings){
		int[] result = new int[strings.length];
		for(int i=0;i<strings.length;i++){
			result[i] = Integer.parseInt(strings[i]);
		}
		return result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		int[] s = parseIntAll(r.readLine().split(" "));
		int q = Integer.parseInt(r.readLine());
		int[] t = parseIntAll(r.readLine().split(" "));

		Arrays.sort(s);
		
		int c = 0;
		for(int x : t){
			if(Arrays.binarySearch(s, x) >= 0){
				c++;
			}
		}
		System.out.println(c);

	}
}