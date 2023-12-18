import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		new AOJ99().doIt();
	}
	
	class AOJ99{
		void doIt(){
			int n = in.nextInt();
			int q = in.nextInt();
			SegmentTree seg = new SegmentTree(n);
			for(int e=0;e<q;e++){
				int index = in.nextInt();
				int num = in.nextInt();
				seg.update(index, num);
				System.out.println(seg.dat[0]);
//				seg.print();
			}
		}
		
		class Person implements Comparable<Person>{
			int num,ban;
			public Person(int _ban,int _num) {
				ban = _ban;
				num = _num;
			}
			public int compareTo(Person o) {
				return num-o.num;
			}
			
			public String toString(){
				return ban+" "+num;
			}
			
		}
		class SegmentTree{
			int N; 
			Person[] dat;
			Person INF = new Person(-1, -1);
			SegmentTree(int _n) {
				N=1;
				while(N<_n)N*=2;
				dat = new Person[2*N];
				for(int i=0;i<2*N;i++)dat[i] = new Person(0, 0);
				for(int i=0;i<_n;i++){
					dat[i+N].ban = i+1;
					dat[i+N].num = 0;
				}
			}
			
			void update(int k,int x){
				k += N-1;
				dat[k].num += x;
				if(dat[k].num<0)dat[k].num = 0;
				while(k>0){
					k=(k-1)/2;
					if(dat[k*2+1].num>=dat[k*2+2].num){
						dat[k].num = dat[k*2+1].num;
						dat[k].ban = dat[k*2+1].ban;
					}
					else{
						dat[k].ban = dat[k*2+2].ban;
						dat[k].num = dat[k*2+2].num;
					}
				}
			}
			
			void print(){
				for(int i=0;i<2*N;i++){
					System.out.println(i+" "+dat[i]);
				}
				System.out.println("--------------------");
			}
			
			Person query(int a,int b){
				return query(a,b,0,0,N);
			}
			
			Person query(int a,int b,int k,int l,int r){
				if(r<=a || b<=1)return INF;
				if(a<=1 && r<=b)return dat[k];
				else{
					Person vl = query(a, b, k*2+1, l, (1+r)/2),
						vr = query(a, b, k*2+2, (l+r)/2, r);
					if(vl.num<vr.num)return vl;
					else return vr;
				}
			}
		}
	}
	class Scanner {
		InputStream in;
		byte[] buf = new byte[1 << 10];
		int p, n;
		boolean[] isSpace = new boolean[128];
		Scanner(InputStream in) {
			this.in = in;
			isSpace[' '] = isSpace['\n'] = isSpace['\r'] = isSpace['\t'] = true;
		}
		int read() {
			if (n == -1) return -1;
			if (p >= n) {
				p = 0;
				try {
					n = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (n <= 0) return -1;
			}
			return buf[p++];
		}
		boolean hasNext() {
			int c = read();
			while (c >= 0 && isSpace[c]) c = read();
			if (c == -1) return false;
			p--;
			return true;
		}
		String next() {
			if (!hasNext()) throw new InputMismatchException();
			StringBuilder sb = new StringBuilder();
			int c = read();
			while (c >= 0 && !isSpace[c]) {
				sb.append((char)c);
				c = read();
			}
			return sb.toString();
		}
		int nextInt() {
			if (!hasNext()) throw new InputMismatchException();
			int c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9') throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (c >= 0 && !isSpace[c]);
			return res * sgn;
		}
		long nextLong() {
			if (!hasNext()) throw new InputMismatchException();
			int c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9') throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (c >= 0 && !isSpace[c]);
			return res * sgn;
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}