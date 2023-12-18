/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int b[] = new int[q];
		int c[] = new int[q];
		for(int i=0;i<q;i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		long sum = 0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		for(int i=0;i<q;i++) {
			if(map.containsKey(b[i])) {
				int a = map.get(b[i]);
				long flag = (long)a * (long)b[i];
				sum = sum-flag;
				map.put(b[i], 0);
				if(map.containsKey(c[i])) {
					map.put(c[i], map.get(c[i])+a);
				}
				else
					map.put(c[i], a);
				flag = (long)a * (long)c[i];
				sum=sum+flag;
				System.out.println(sum);
			}
			else {
				System.out.println(sum);
			}
		}
		sc.close();
	}
}
