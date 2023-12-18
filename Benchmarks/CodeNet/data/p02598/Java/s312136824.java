import java.util.*;
import java.io.PrintWriter;
public class Main {
	
	static PrintWriter out;
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long ans=0,l=1,r=(long)(1e18);
		while(l<=r) {
			long mid=(l+(r-l)/2);
			//out.println(l+" "+r+" "+mid+" "+ok(mid,a,k));
			if(ok(mid,a,k)) {
				ans=mid;
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		out.print(ans);
		
		sc.close();
		out.close();
		
	}
	static boolean ok(long mid,int a[],int k) {
		for(int i=0;i<a.length;i++) {
			if(k+(a[i]%mid==0?1:0)>=(a[i])/mid) {
				k-=(a[i])/mid;
				if(a[i]%mid==0)k++;
			}
			else return false;
		}
		return true;
	}
}
