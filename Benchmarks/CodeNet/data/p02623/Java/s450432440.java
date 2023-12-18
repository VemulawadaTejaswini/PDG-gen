
import java.util.*;

import java.math.*;

public class Main {


	public static long solve(long[] arr1,long[] arr2, int k) {
 
		TreeMap<Long,Integer> map=new TreeMap<>();
		
		long ans=0;
		long count=0;
		map.put(0l, -1);
		for(int i=0;i<arr2.length;i++)
			map.put(arr2[i], i);
		for(int i=0;i<arr1.length;i++) {
			long rem=k-arr1[i];
			
			Long cc=map.floorKey(rem);
			if(cc!=null) {
				count=Math.max(count,i+1+map.get(cc)+1);
			}
			
		}
 
		return count;
	}
 
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		int t=1;
		while(t-->0) {
			int n=s.nextInt();
			int m=s.nextInt();
			int k=s.nextInt();
			long[] arr1=new long[n];
			long[] arr2=new long[m];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i]=s.nextLong();
				if(i>0)
					arr1[i]+=arr1[i-1];
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i]=s.nextLong();
				if(i>0)
					arr2[i]+=arr2[i-1];
			}
			if(n>=m)
			System.out.println(solve(arr1,arr2,k));
			else {
				System.out.println(solve(arr2,arr1,k));
			}
		}
 
 
	}
}

