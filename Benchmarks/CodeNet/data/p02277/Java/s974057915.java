import java.util.*;
class S{
	String r;
	long b;
	int t;
	public S(String r,long b,int t) {
		this.r=r;
		this.b=b;
		this.t=t;
	}
}
public class Main{
	static boolean i(S a[]) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i].b==a[i+1].b&&a[i].t>a[i+1].t) {
				return true;
			}
		}
		return false;
	}
	static int q(S a[],int low,int high) {
		 int i=low-1;
	    long key = a[high].b;
	    for(int j=low;j<high;j++) {
	    	if(a[j].b<=key) {
	    		i++;
	    		S temp = a[i];
	    		a[i] = a[j];
	    		a[j] = temp;
	    	}	
	    }
	    S temp=a[i+1];
	    a[i+1]=a[high];
	    a[high]=temp;
	    return i+1;
	}
	static void sort(S a[],int low,int high){
		if(low<high) {
			int q=q(a,low,high);
			sort(a,low,q-1);
			sort(a,q+1,high);
		}
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		S a[]=new S[n];
		for(int i=0;i<n;i++) {
			String r=in.nextLine();
			String c[]=r.split(" ");
			a[i]=new S(r,Long.parseLong(c[1]),i);
		}
		sort(a,0,n-1);
		if(i(a))System.out.println("Not stable");
		else System.out.println("Stable");
		for(S i:a) {
			System.out.println(i.r);
		}
	}
}