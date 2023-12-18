import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		long[] two=new long[n/2];
		long[] ans=new long[n];
		SegTree st=new SegTree(n/2);
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		int count=0;
		for(int i=0; i<n; i+=2){
			two[i/2]=(a[i]^a[i+1]);
			st.set(count++,a[i]^a[i+1]);
		}
		for(int i=0; i<n; i++){
			long tmpb=0;
			long tmpf=0;
			if(i/2>0){
				tmpb=st.query(0,i/2);
			}
			if(i/2+1<n/2){
				tmpf=st.query(1+i/2,1+n/2);
			}
			if(i%2==0){
				System.out.println(a[i+1]^tmpb^tmpf);
			}else{
				System.out.println(a[i-1]^tmpb^tmpf);
			}
		}
	}
	static class SegTree{
		int n=1;
		long[] v;
		
		public SegTree(int n) {
			while(this.n<n)this.n*=2;
			v=new long[2*this.n-1];
		}
		
		void set(int k,long val) {
			k+=n-1;
			v[k]=val;
			while(k>0) {
				k=(k-1)/2;
				v[k]=v[2*k+1]^v[2*k+2];
			}
		}
		//bをプラス1
		long query(int a,int b) {
			return query(0,n,a,b,0);
		}
		
		long query(int l,int r,int a,int b,int k) {
			if(r<=a||b<=l)return 0;
			else if(a<=l&&r<=b)return v[k];
			else {
				long vl=query(l,(l+r)/2,a,b,2*k+1);
				long vr=query((l+r)/2,r,a,b,2*k+2);
				return vl^vr;
			}
		}
	}
}
