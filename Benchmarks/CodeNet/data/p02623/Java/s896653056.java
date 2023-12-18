

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static long Mod=1000000007l;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s3=br.readLine().split(" ");
		int n=Integer.parseInt(s3[0].trim());
		int m=Integer.parseInt(s3[1].trim());
		long k=Long.parseLong(s3[2].trim());
		
		String[] s1=br.readLine().split(" ");
		long[] a=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Long.parseLong(s1[i].trim());
		}
		String[] s2=br.readLine().split(" ");
		long[] b=new long[m];
		for(int i=0;i<m;i++)
		{
			b[i]=Long.parseLong(s2[i].trim());
		}

		algo(a,b,n,m,k);
	}

	public static void algo(long[] a,long[] b,int n,int m,long min) {
		int i=0,j=0;
		
		long res=0l;
		
		while((i<n || j<m) && (min>=0)) {
			
			if(i<n && j<m) {
				if(a[i]<b[j]) {
					min-=a[i];
					i++;
				}
				else {
					min-=b[j];
					j++;
				}	
				
				if(min>=0) {
					res=(res +1)%Mod;
				}
			}
			else if(i<n) {
				min-=a[i];
				i++;
				if(min>=0) {
					res=(res +1)%Mod;
				}
				
			}
			else if(j<m) {
				min-=b[j];
				j++;
				if(min>=0) {
					res=(res +1)%Mod;
				}
			}
			
		}
		
		System.out.println(res);
		
		
		
		
		
	}
	
	
	
}
