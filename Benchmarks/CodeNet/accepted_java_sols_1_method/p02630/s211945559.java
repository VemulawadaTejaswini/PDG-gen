import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		long sum = 0;
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(map.containsKey(arr[i]))
			{
				int a = map.get(arr[i]);
				a++;
				map.replace(arr[i],a);
			}
			else
			{
				map.put(arr[i],1);
			}
			sum = sum + (long)arr[i];
		}
		int q = sc.nextInt();
		int[] b = new int[q];
		int[] c = new int[q];
		for(int i=0;i<q;i++)
		{
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			if(map.containsKey(b[i]))
			{
			int s = map.get(b[i]);
			sum = sum+(long)(s*(c[i]-b[i]));
			System.out.println(sum);
			if(map.containsKey(c[i]))
			{
				int a = map.get(c[i]);
				a = a+s;
				map.replace(c[i],a);
			}
			else
			{
				map.put(c[i],s);
			}
			map.remove(b[i]);
		}
		else
		{
			System.out.println(sum);
		}
		}
	}
}