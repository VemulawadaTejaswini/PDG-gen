/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//, b = sc.nextInt(), c=  sc.nextInt(), d = sc.nextInt();
		int sqrt = (int)Math.sqrt(a);
		List<Integer> list = new ArrayList<>();
		if(a<=3){
			System.out.println(1);return;	
		}
		for(int i=2;i<=sqrt;i++){
			for(int ii=2;;ii++){
				if(Math.pow(i,ii)<a){
					list.add((int)Math.pow(i,ii));
				} else if(Math.pow(i,ii)==a){
					list.add((int)Math.pow(i,ii));break;
				} else break;	
			}
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}
}