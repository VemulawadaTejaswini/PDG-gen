package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 class Main {

	static long min=Integer.MAX_VALUE;
	private static long fun(long n,long a,long b,long c,long d,long e,long ans) {
		if(e==n&&min>ans) {
			min=ans;
			return ans;
		}
		if(e==n)
			return ans;
//		if(e>n)//||e<=0)
//			return ans;
		if(e>0) {
		fun(n,a,b,c,d,e*2,ans+a);
		fun(n,a,b,c,d,e*3,ans+b);
		fun(n,a,b,c,d,e*5,ans+c);
		}
		if(e>n)
		fun(n,a,b,c,d,e-1,ans+d);
		if(e<n)
		fun(n,a,b,c,d,e+1,ans+d);
		
		return ans;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			String q[]=br.readLine().split(" ");
//			long n=Long.parseLong(q[0]);
//			long a=Long.parseLong(q[1]);
//			long b=Long.parseLong(q[2]);
//			long c=Long.parseLong(q[3]);
//			long d=Long.parseLong(q[4]);
//			min=Long.MAX_VALUE;
//			fun(n,a,b,c,d,0,0);
//			System.out.println(min);
			int a[]=new int[(n*n)+1];
			for(int i=1;i<=n*n;i++)
				a[i]=Integer.parseInt(q[i-1]);
			int b[][]=new int[n+1][n+1];
			int d=0;
			for(int i=1;i<=n*n;i++) {
				int r=a[i]/n;
//				if(r==)
				int c=a[i]%n;
				if(c==0) {
					c=n;
//					r++;
					}
				else
					r++;
				b[r][c]=1;
				int y=0;
				for(int k=1;k<c;k++) {
					if(b[r][k]==0)
						y++;
				}
				int y1=0;
				for(int k=c+1;k<=n;k++) {
					if(b[r][k]==0)
						y1++;
				}
				int y2=0;
				for(int k=1;k<r;k++) {
					if(b[k][c]==0)
						y2++;
				}
				int y3=0;
				for(int k=r+1;k<=n;k++) {
					if(b[k][c]==0)
						y3++;
				}
				d+=Math.min(Math.min(y, y3),Math.min(y1, y2));
					
			}
			System.out.println(d);
//		}
//		Scanner s=new Scanner(System.in);
//		double x=s.nextDouble();
//		String y=s.nextLine();
//		System.out.println("=====================================");
//		System.out.println(y+" "+0);
//		System.out.println(x);
	}

}
