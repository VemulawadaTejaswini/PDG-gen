import java.util.*;
class Main {
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n=sc.nextInt(),s=sc.nextInt();
			nPrPermutation perlist= new nPrPermutation(10,n);
			int count=0;
			for(int[] per:perlist){
				int _s=0;
				for(int i=0;i<n;i++){
					_s+=per[i]*(i+1);
				}
				if(s==_s){
					count++;
				}
			}
			ln(count);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}
class nPrPermutation implements Iterable<int[]> {
	private final int size;
	private final int r;

	public static void main(String[] _){//テスト
		nPrPermutation p= new nPrPermutation(10,2);

		for(int[] array:p){
			for(int val :array){
				System.out.print(val+" ");
			}

			System.out.println();
		}
	}

	public nPrPermutation(int size,int r) {
		if (size <= 0|| r<0 || r>size) throw new IllegalArgumentException();
		this.size = size;
		this.r=r;
	}
	public Iterator<int[]> iterator() {
		return new Iter(size,r);
	}
	private class Iter implements Iterator<int[]> {
		private final int[] source;
		private final int[] end;
		private boolean isFirst=true;
		private int size;
		private int r;

		private Iter(int size,int r) {
			source = new int[size];
			end=new int[size];
			this.size=size;
			this.r=r;
			for(int i = 0; i < size; ++i) {
				source[i] = i;
				end[size-i-1]=i;
			}
		}
		public boolean hasNext() {
			if(isFirst && size==1){
				return true;
			}
			for (int i = 0; i < r; i++) {
				if(source[i]!=end[i]){
					return true;
				}
			}
			return false;
		}
		public int[] next() {
			if(isFirst){
				isFirst=false;
				return Arrays.copyOf(source,r);
			}
			int n = source.length;
			int prev=source[r-1];
			loop:while(true){//stack over flow 対策
				for (int i = n - 1; i > 0; i--) {
					if (source[i - 1] < source[i]) {
						int j = n;
						while (source[i - 1] >= source[--j]);
						swap(source, i - 1, j);
						reverse(source, i, n);
						if(source[r-1]!=prev)return Arrays.copyOf(source,r);
						else continue loop;
					}
				}
				break loop;
			}
			reverse(source, 0, n);
			return Arrays.copyOf(source,r);
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
		private void swap(int[] is, int i, int j) {
			int t = is[i];
			is[i] = is[j];
			is[j] = t;
		}
		private void reverse(int[] is, int s, int t) {
			while (s < --t) swap(is, s++, t);
		}
	}
}