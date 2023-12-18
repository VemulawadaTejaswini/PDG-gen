import java.util.*;

class UF{
	public int[] a;
	public UF(int size){
		Arrays.fill(a=new int[size],-1);
	}
	public int root(int t){
		return a[t]<0?t:(a[t]=root(a[t]));
	}
	public boolean connect(int p,int c){
		p=root(p);
		c=root(c);
		if(p==c)
			return false;
		if(a[p]>a[c]){
			int buf=c;
			c=p;
			p=buf;
		}
		a[p]+=a[c];
		a[c]=p;
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

		var n=s.nextInt();
		var q=s.nextInt();

		var uf=new UF(n);

		for(int i=0;i<q;++i)
			if(s.nextInt()==0)
				uf.connect(s.nextInt(),s.nextInt());
			else
				System.out.println(uf.isConnected(s.nextInt(),s.nextInt())?1:0);
	}
}
