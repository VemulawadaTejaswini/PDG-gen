import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int a[]= new int[n];
		for( int i=0; i<n; i++){
			a[i] = sc.nextInt();
			map.putIfAbsent(a[i],0);
			map.put(a[i],map.get(a[i])+1);
		}
		int count=0;
		for(int i=0; i<n; i++){
		//	System.out.println(count);
			if(!map.containsKey(a[i]))continue;
			if(map.get(a[i])>a[i]){
				count+=map.get(a[i])-a[i];
				map.remove(a[i]);
			}
			else if(map.get(a[i])<a[i]){
				count+=map.get(a[i]);
				map.remove(a[i]);
			}
		}
		System.out.println(count);
	}
}