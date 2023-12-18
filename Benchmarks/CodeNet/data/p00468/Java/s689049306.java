import java.util.BitSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		while(true){
			int n=getInt();
			if(n==0)return;
			BitSet r=new BitSet(),f[]=new BitSet[n];
			for(int i=0;i<n;++i)f[i]=new BitSet();
			for(int i=getInt();i>0;--i) {
				int a=getInt()-1,b=getInt()-1;
				f[a].set(b);
				f[b].set(a);
			}

			r.set(0);
			for(int i=f[0].nextSetBit(0);i!=-1;i=f[0].nextSetBit(i+1))
				r.or(f[i]);
			System.out.println(r.cardinality()-1);
		}
	}
}