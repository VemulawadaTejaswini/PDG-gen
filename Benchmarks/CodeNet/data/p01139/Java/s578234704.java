
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main{

    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
        while(true){
	        int w = sc.nextInt();
    	    int h = sc.nextInt();
    	    if(w==0 && h==0){
    	    	break;
    	    }
    	    String[] str = new String[h];
    	    boolean[][] judge = new boolean[w][h];
    	    for(int i=0;i<h;i++){
    	    	str[i] = sc.next();
    	    }
    	    int[] dx = {-1,0,1,0};
    	    int[] dy = {0,-1,0,1};
    	    ArrayList<Point> list1 = new ArrayList<Point>();
    	    ArrayList<Point> list2 = new ArrayList<Point>();
    	    int bcount = 0;
    	    int wcount = 0;
    	    for(int i=0;i<h;i++){
    	    	for(int j=0;j<w;j++){
    	    		if(str[i].charAt(j)!='.'){
    	    			continue;
    	    		}
    	    		Point point = new Point(j,i);
    	    		boolean black = false;
    	    		boolean white = false;
    	    		list1.add(point);
    	    		while(true){
    	    			while(!list1.isEmpty()){
    	    				point = list1.get(0);
    	    				list1.remove(0);
    	    				for(int k=0;k<4;k++){
    	    					if(point.x==0 && k==0){
    	    						continue;
    	    					}
    	    					if(point.x==w-1&&k==2){
    	    						continue;
    	    					}
    	    					if(point.y==0&&k==1){
    	    						continue;
    	    					}
    	    					if(point.y==h-1&&k==3){
    	    						continue;
    	    					}
    	    					if(str[point.y+dy[k]].charAt(point.x+dx[k])=='.' && !judge[point.x+dx[k]][point.y+dy[k]]){
    	    						judge[point.x+dx[k]][point.y+dy[k]] = true;
    	    						Point p = new Point(point.x+dx[k],point.y+dy[k]);
    	    						list2.add(p);
    	    					}
    	    					if(str[point.y+dy[k]].charAt(point.x+dx[k])=='B'){
    	    						black = true;
    	    					}
    	    					if(str[point.y+dy[k]].charAt(point.x+dx[k])=='W'){
    	    						white = true;
    	    					}
    	    				}
    	    			}
    	    			if(list2.isEmpty()){
    	    				break;
    	    			}
    	    			list1.clear();
    	    			for(int k=0;k<list2.size();k++){
    	    				list1.add(list2.get(k));
    	    			}
    	    			list2.clear();
    	    		}
    	    		for(int k=0;k<w;k++){
    	    			Arrays.fill(judge[k],false);
    	    		}
    	    		if(black && !white){
    	    			bcount++;
    	    		}
    	    		if(!black && white){
    	    			wcount++;
    	    		}
    	    	}
    	    }
    	    out.println(bcount+" "+wcount);
    	    out.flush();
    	}
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}

class Reader {
    private final InputStream sc;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.sc = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = sc

.read(buf);
        }catch (IOException e) {e.printStackTrace();}
        if (buflen <= 0) return false;
        return true;
    }

    private int readByte() { if (hasNextByte()) return buf[ptr++]; else return -1;}

    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}

    private void skip() { while(hasNextByte() && !isPrintableChar(buf[ptr])) ptr++;}

    public boolean hasNext() {skip(); return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        boolean minus = false;
        long num = readByte();

        if(num == '-'){
            num = 0;
            minus = true;
        }else if (num < '0' || '9' < num){
            throw new NumberFormatException();
        }else{
            num -= '0';
        }
        
        while(true){
            int b = readByte();
            if('0' <= b && b <= '9')
                num = num * 10 + (b - '0');
            else if(b == -1 || !isPrintableChar(b))
                return minus ? -num : num;
            else
                throw new NoSuchElementException();
        }
    }

    public int nextInt() {
        long num = nextLong();
        if (num < Integer.MIN_VALUE || Integer.MAX_VALUE < num)
            throw new NumberFormatException();
        return (int)num;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public char nextChar() {
        if (!hasNext()) throw new NoSuchElementException();
        return (char)readByte();
    }

    public String nextLine() {
        while (hasNextByte() && (buf[ptr] == '\n' || buf[ptr] == '\r')) ptr++;
        if (!hasNextByte()) throw new NoSuchElementException();

        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (b != '\n' && b != '\r') {
            sb.appendCodePoint(b);
            b = readByte();
        }

        return sb.toString();
    }

    public int[] nextIntArray(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) res[i] = nextInt();
        return res;
    }

    public char[] nextCharArray(int n) {
        char[] res = new char[n];
        for (int i=0; i<n; i++) res[i] = nextChar();
        return res;
    }

    public void close() {try{ sc.close();}catch(IOException e){ e.printStackTrace();}};
}