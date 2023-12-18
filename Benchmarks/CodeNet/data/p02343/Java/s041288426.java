import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
     
public class Main{
    
    static InputReader ir;
    static PrintWriter out;

    static void solve(){
        UnionFindTree tree=new UnionFindTree(ir.nextInt());
	int q=ir.nextInt();
	while(q-->0){
	    int query=ir.nextInt();
	    int x=ir.nextInt();
	    int y=ir.nextInt();
	    if(query==0) tree.unite(x,y);
	    else out.println(tree.same(x,y)?"1":"0");
	}
    }
    public static class UnionFindTree{
  
	private static int[] par;
	private static int[] rank;
  
	public UnionFindTree(int size){
	    par=new int[size];
	    rank=new int[size];
	    for(int i=0;i<size;i++){
		par[i]=i;
		rank[i]=0;
	    }
	}
  
	private static int find(int x){
	    if(par[x]==x) return x;
	    else return par[x]=find(par[x]);
	}
  
	public static void unite(int x,int y){
	    x=find(x);
	    y=find(y);
	    if(x==y) return;
	    else if(rank[x]>rank[y])
		par[y]=x;
	    else{
		par[x]=y;
		if(rank[x]==rank[y])
		    rank[y]++;
	    }
	}
  
	public static boolean same(int x,int y){
	    return find(x)==find(y);
	}
    }
 
    public static void main(String[] args) throws Exception {
	ir = new InputReader(System.in);
     	out = new PrintWriter(System.out);
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
	    for(int i=0;i<n;i++)
		a[i]=nextInt();
	    return a;
	}
  
	public char[][] nextCharMap(int n,int m){
	    char[][] map=new char[n][m];
	    for(int i=0;i<n;i++)
		map[i]=next().toCharArray();
	    return map;
	}
    }
}

