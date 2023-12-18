import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),N=1<<n,m=s.nextInt();
		long[] v=new long[N];
		Arrays.fill(v,Integer.MAX_VALUE);

		for(int i=0;i<m;++i){
			int w=s.nextInt();
			int f=0;
			for(int k=s.nextInt();k>0;--k)
				f|=1<<(s.nextInt()-1);
			v[f]=Math.min(v[f],w);
		}

		if(n<5)
			System.err.println(Arrays.toString(v));
		for(int i=2;i<N;++i) {
			for(int j=1;j<i;++j) {
				v[i|j]=Math.min(v[i|j],v[i]+v[j]);
			}
			if(n<5)
				System.err.println(Arrays.toString(v));
		}
		System.out.println(v[N-1]==Integer.MAX_VALUE?-1:v[N-1]);
	}
}
