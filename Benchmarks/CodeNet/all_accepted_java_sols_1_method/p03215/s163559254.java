import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long a[]=new long[n];
		long c[]=new long[n*(n+1)/2];
		int m=40;
		int count=0;
		for(int i=0;i<n;++i) {
			a[i]=sc.nextLong();
		}
		for(int i=0;i<n;++i) {
			c[count]=a[i];
			++count;
			for(int j=i+1;j<n;++j) {
				c[count]=c[count-1]+a[j];
				++count;
			}
		}
		long x=0L;
		for(int j=40;j>=0;--j) {
			count =0;
			for(int i=0;i<c.length;++i) {
				if((c[i] & (long)(x+Math.pow(2, j))) == x+Math.pow(2, j))++count;
				if (count==k)break;
			}
			if(count==k)x=x+(long)Math.pow(2, j);
		}
		
		System.out.println(x);


	}
}
