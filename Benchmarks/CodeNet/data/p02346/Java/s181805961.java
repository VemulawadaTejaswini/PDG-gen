import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		Segtree sg=new Segtree(N);
		for(; Q>0; Q--) {
			int com=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(com==0) {
				sg.add(x-1,y);
			}
			else if(com==1) {
				pl(sg.sum(x-1,y-1,0,0,(sg.length()+1)/2));
			}
		}
	}
	static class Segtree{
		int[] Segtree;
		public Segtree(int vol){
			int truevol=calc_vol(vol);		//vol以上で最も小さい2ベキを求める
			Segtree=new int[truevol*2-1];
			for(int i=0; i<truevol*2-1; i++) {
				Segtree[i]=0;
			}
			//pl(truevol*2-1);
		}
		public void fill(int num) {		//特定の値にフィルする
			for(int i=0; i<Segtree.length; i++) {
				Segtree[i]=num;
			}
		}
		public int calc_vol(int vol) {	//2のべき乗の値のサイズにする
			int beki=0;
			int tmp=1;
			while(vol>=tmp) {
				tmp*=2;
				if(tmp==vol) {
					break;
				}
				beki++;
			}
			return tmp;
		}
		public int getParent(int num) {	//親取得
			return (num-1)/2;
		}
		public int getChild(int num) {	//子取得
			return num*2+1;	//子は2つあるが、そのうち数が若いほう
		}
		public void add(int elem,int num) {	//elem番目の要素にnum足す(elemは0オリジン)
			int leaf=elem-1+(length()+1)/2;	//更新するセグ木の末端
			boolean zero=false;	//0までたどり着いたか
			while(!zero && leaf>=0) {
				//pl(leaf);
				Segtree[leaf]+=num;
				if(leaf==0) {
					zero=true;
				}
				leaf=getParent(leaf);	//上に（根の方）近づく
			}
		}
		public int sum(int a, int b, int k, int l, int r) {//sum(a, b, 0, 0, seg.tree.length/2)
			//[a,b]の要素の和を求める
			if(r <= a || b < l) return 0; //区間が交わっていないなら0
			if(a <= l && r-1 <= b) return Segtree[k]; //[l,r)が完全に[a,b)に内包されているならそのノードを返す
			else {
				int vl = sum(a, b, k*2+1, l, (l+r)/2);
				int vr = sum(a, b, k*2+2, (l+r)/2, r);
				return vl + vr;
			}
		}
		public int length() {
			return Segtree.length;
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static int root(int a) {
		int ketasu=0;
		int tmp=a;
		while(tmp>0) {
			ketasu++;
			tmp/=10;
		}
		int constant=(ketasu+1)/2;	//よく使うので定数化
		if(ketasu>=1) {
			int[] suuji=new int[constant];
			tmp=a;
			for(int i=0; i<constant; i++) {
				suuji[constant-1-i]=a%100;
				a/=100;
			}
			int ans=0;
			int kai=0;
			int mae=0;
			if(constant<=1) {
				for(int i=10; i>=0; i--) {
					if(suuji[0]>=i*i) {
						return i;
					}
				}
			}
			else {
				for(int i=0; i<constant; i++) {
					mae+=kai*2;
					for(int j=9; j>=0; j--) {
						if((mae*10+j)*j<=suuji[i]) {
							ans=ans*10+j;
							mae*=10;
							kai=j;
							if(i+1<constant) {
								suuji[i+1]+=(suuji[i]-(mae+j)*j)*100;
							}
							break;
						}
					}
				}
			}
			return ans;
		}
		else {
			return 0;
		}
	}
}
