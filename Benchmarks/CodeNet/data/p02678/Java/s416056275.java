/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		int p = s.nextInt();
		DSU dsu = new DSU(n);
		for(int i=0;i<p;i++){
			int a = s.nextInt();
			int b = s.nextInt();
			if(!map.containsKey(a-1)){
				map.put(a-1,new ArrayList<>());
			}
			if(!map.containsKey(b-1)){
				map.put(b-1,new ArrayList<>());
			}
			map.get(a-1).add(b-1);
			map.get(b-1).add(a-1);
			dsu.union(a-1,b-1);
		}
		if(dsu.count >1){
			System.out.println("No");
		}
		else{
			for(int i=1;i<n;i++){
				System.out.println(map.get(i).get(0) +1);
			}
		}
		
	}
	public static class DSU{
		static int parents[];
		static int count;
		public DSU(int len){
			parents = new int[len];
			for(int i=0;i<len;i++){
				parents[i]=i;
			}
			count = len;
		}
		public static int find(int x){
			if(parents[x]!=x){
				parents[x] = find(parents[x]);
			}
			return parents[x];
		}
		public static void union(int x , int y){
			int xr = find(x);
			int yr = find(y);
			if(xr == yr){
				return;
			}
			else{
				parents[xr] = yr;
			}
			count--;
		}
	}
}