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
		String s=br.readLine();
		String[] str = s.split(" ");
		long count = 0;
		long timer = 0;
		int time = 0;
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		String name = new String();
		int[] array = new int[n];
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<String> namequeue = new LinkedList<String>();
		for(int i=0;i<n;i++){
			s = br.readLine();
			str = s.split(" ");
			namequeue.add(str[0]);
			queue.add(Integer.parseInt(str[1]));
		}
		for(int i=0;queue.isEmpty()!=true;i++){
			time=queue.poll();
			name=namequeue.poll();
			if(time>q){
				queue.add(time-q);
				namequeue.add(name);
				timer+=q;
			}
			else{
				timer+=time;
				System.out.println(name+" "+timer);
			}
		}
	}
}