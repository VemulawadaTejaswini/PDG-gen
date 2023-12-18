//package gfg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

 class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////		int t=Integer.parseInt(br.readLine().trim());
//		while(t-->0)
//		{
			String[] s1=br.readLine().split(" ");
			int n=Integer.parseInt(s1[0].trim());	
			int k=Integer.parseInt(s1[1].trim());	
			String[] s=br.readLine().split(" ");
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(s[i].trim());
			}
			
			System.out.println(algo(a,k));
		
//		}
	}

	public static int algo(int[] a,int k) {
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=a[i];
		}
		
		return sum;
		
	}
	
	
	
}

