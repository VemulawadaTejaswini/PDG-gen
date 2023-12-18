/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//ArrayList<Integer> array = new ArrayList<Integer>();
		String s=br.readLine();
		String[] str = s.split(" ");
		int count = 0;
		int timer = 0;
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		String[] name = new String[n];
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			s = br.readLine();
			str = s.split(" ");
			name[i]=str[0];
			array[i]=Integer.parseInt(str[1]);
		}
		for(int i = 0;count!=n;i++){
			int time = array[i%n];
			if(time==0) continue;
			if(time>100){
				array[i%n] = time-100;
				timer+=100;
			}
			else{
				timer+=array[i%n];
				array[i%n] = 0;
				System.out.println(name[i%n]+" "+timer);
				count++;
			}	
		}
	}
}