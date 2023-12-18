import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main{

	static PrintWriter out;
	static InputReader ir;
	static final double EPS=1e-10;

	static void solve(){
		char[] ex=ir.next().toCharArray();
		int n=ir.nextInt();
		int m=0;
		for(int i=1;i<=ex.length;i+=2){
			if(i==ex.length){
				m+=ex[ex.length-1]-'0';
				break;
			}
			if(ex[i]=='+'){
				m+=ex[i-1]-'0';
			}
			else{
				int r=ex[i-1]-'0';
				while(i<ex.length&&ex[i]!='+'){
					i+=2;
					r*=ex[i-1]-'0';
				}
				m+=r;
			}
		}
//		out.println(m);
		int l=ex[0]-'0';
		for(int i=1;i<ex.length;i+=2){
			if(ex[i]=='+')
				l+=ex[i+1]-'0';
			else
				l*=ex[i+1]-'0';
		}
		boolean M=m==n;
		boolean L=l==n;
		if(M&&L) out.println("U");
		else if(M) out.println("M");
		else if(L) out.println("L");
		else out.println("I");
	}

	static String code(String s,int k){
		if(s.length()<=k) return s;
		return s.substring(0,k);
	}

	public static void main(String[] args) throws Exception{
		ir=new InputReader(System.in);
		out=new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer=new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {this.in=in; this.curbuf=this.lenbuf=0;}

		public boolean hasNextByte() {
			if(curbuf>=lenbuf){
				curbuf= 0;
				try{
					lenbuf=in.read(buffer);
				}catch(IOException e) {
					throw new InputMismatchException();
				}
				if(lenbuf<=0) return false;
			}
			return true;
		}

		private int readByte(){if(hasNextByte()) return buffer[curbuf++]; else return -1;}

		private boolean isSpaceChar(int c){return !(c>=33&&c<=126);}

		private void skip(){while(hasNextByte()&&isSpaceChar(buffer[curbuf])) curbuf++;}

		public boolean hasNext(){skip(); return hasNextByte();}

		public String next(){
			if(!hasNext()) throw new NoSuchElementException();
			StringBuilder sb=new StringBuilder();
			int b=readByte();
			while(!isSpaceChar(b)){
				sb.appendCodePoint(b);
				b=readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if(!hasNext()) throw new NoSuchElementException();
			int c=readByte();
			while (isSpaceChar(c)) c=readByte();
			boolean minus=false;
			if (c=='-') {
				minus=true;
				c=readByte();
			}
			int res=0;
			do{
				if(c<'0'||c>'9') throw new InputMismatchException();
				res=res*10+c-'0';
				c=readByte();
			}while(!isSpaceChar(c));
			return (minus)?-res:res;
		}

		public long nextLong() {
			if(!hasNext()) throw new NoSuchElementException();
			int c=readByte();
			while (isSpaceChar(c)) c=readByte();
			boolean minus=false;
			if (c=='-') {
				minus=true;
				c=readByte();
			}
			long res = 0;
			do{
				if(c<'0'||c>'9') throw new InputMismatchException();
				res=res*10+c-'0';
				c=readByte();
			}while(!isSpaceChar(c));
			return (minus)?-res:res;
		}

		public double nextDouble(){return Double.parseDouble(next());}

		public int[] nextIntArray(int n){
			int[] a=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}

		public long[] nextLongArray(int n){
			long[] a=new long[n];
			for(int i=0;i<n;i++) a[i]=nextLong();
			return a;
		}

		public char[][] nextCharMap(int n,int m){
			char[][] map=new char[n][m];
			for(int i=0;i<n;i++) map[i]=next().toCharArray();
			return map;
		}
	}
}