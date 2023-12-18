import java.util.*;

class UF{
	public int[] a;
	public UF(int size){
		Arrays.fill(a=new int[size],-1);
	}
	public int root(int t){
		return a[t]<0?t:(a[t]=root(a[t]));
	}
	public boolean connect(int r,int s){
		r=root(r);
		s=root(s);
		if(r==s)
			return false;
		if(a[r]>a[s]){
			a[s]+=a[r];
			a[r]=s;
		}else{
			a[r]+=a[s];
			a[s]=r;
		}
		return true;
	}
	public boolean isConnected(int a,int b){
		return root(a)==root(b);
	}
	public int groupSize(int t){
		return -a[root(t)];
	}
}

public class Main{
	public static void main(String[] $){
		var s=new Scanner(System.in);

		var a=s.nextLine().split(" ");
		var n=Integer.parseInt(a[0]);
		var q=Integer.parseInt(a[1]);

		var uf=new UF(n);

		for(int i=0;i<q;++i){
			var b=s.nextLine().split(" ");
			var t=Integer.parseInt(b[0]);
			var u=Integer.parseInt(b[1]);
			var v=Integer.parseInt(b[2]);

			if(t==0)
				uf.connect(u,v);
			else
				System.out.println(uf.isConnected(u,v)?1:0);
		}
	}
}
