import java.util.*;

class UF{
	public int[] a;
	public UF(int size){
		Arrays.fill(a=new int[size],-1);
	}
	public int root(int t){
		return a[t]<0?t:(a[t]=root(a[t]));
	}
	public boolean connect(int p,int q){
		p=root(p);
		q=root(q);
		if(p==q)
			return false;
		if(a[p]>a[q]){
			a[q]+=a[p];
			a[p]=q;
		}else{
			a[p]+=a[q];
			a[q]=p;
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
