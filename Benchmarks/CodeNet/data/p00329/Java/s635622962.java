import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

public class Main{
	public static void main(String[]$) throws IOException{
		new Main().solve();
	}
	static FastScanner s=new FastScanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static int gInt() throws IOException{return s.nextInt();}
	static long gLong() throws IOException{return s.nextLong();}
	static long gDouble() throws IOException{return s.nextLong();}

	int n,usedno[];
	BitSet used,col[],buf[];

	private void solve() throws IOException{
		n=gInt()-1;
		usedno=new int[n];
		col=new BitSet[n];
		buf=new BitSet[n];
		for(int i=0;i<n;++i) {
			col[i]=new BitSet();
			buf[i]=new BitSet();
		}
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				col[j].set(i,gLong()==1);
			}
		}

		for(int i=0;i<n;++i) {
			buf[i].or(col[i]);
		}

		if(search(0)) {
			System.out.println("yes");
			Arrays.stream(usedno).forEach(System.out::println);
		}else {
			System.out.println("no");
		}
//		Arrays.stream(buf).forEach(System.out::println);
	}
	private boolean search(int curc){
		if(curc==n)
			return true;
		for(int i=buf[curc].nextSetBit(0);i!=-1;i=buf[curc].nextSetBit(i+1)) {
			boolean f=false;
			for(int c=curc+1;c<n;++c) {
				buf[c].clear(i);
				f|=buf[c].isEmpty();
			}
			if(f) {
				for(int c=curc+1;c<n;++c) {
					buf[c].set(i,col[c].get(i));
				}
				continue;
			}
			usedno[curc]=i+1;
//			System.out.println(curc+" "+i);
//			Arrays.stream(buf).forEach(System.out::println);

			if(search(curc+1))
				return true;
			
			for(int c=curc+1;c<n;++c) {
				buf[c].set(i,col[c].get(i));
			}
			continue;
		}
		return false;
	}
	static void yesno(boolean f) {
		yesno(f,"YES","NO");
	}
	static void yesno(boolean f,String yes,String no) {
		System.out.println(f?yes:no);
	}
}
class FastScanner{
	private final BufferedInputStream	in;
	private static final int			bufSize	=1<<16;
	private final byte					buf[]	=new byte[bufSize];
	private int							i		=bufSize;
	private int							k		=bufSize;
	private final StringBuilder			str		=new StringBuilder();

	FastScanner(InputStream in){
		this.in=new BufferedInputStream(in,bufSize);
	}
	int nextInt() throws IOException{
		return (int)nextLong();
	}
	long nextLong() throws IOException{
		int c;
		long x=0;
		boolean sign=true;
		while((c=nextChar())<=32)
			;
		if(c=='-'){
			sign=false;
			c=nextChar();
		}
		if(c=='+'){
			c=nextChar();
		}
		while(c>='0'){
			x=x*10+(c-'0');
			c=nextChar();
		}
		return sign?x:-x;
	}
	int nextChar() throws IOException{
		if(i==k){
			k=in.read(buf,0,bufSize);
			i=0;
		}
		return i>=k?-1:buf[i++];
	}
	String next() throws IOException{
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1){
			return null;
		}
		while(c>32){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
	String nextLine() throws IOException{
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1){
			return null;
		}
		while(c!='\n'){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
}