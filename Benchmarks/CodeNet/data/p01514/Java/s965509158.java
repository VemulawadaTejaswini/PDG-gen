
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
        	int t = sc.nextInt();
        	int p = sc.nextInt();
        	int r = sc.nextInt();
        	if(t==0 && p==0 && r==0){
        		break;
        	}
        	boolean[] judge = new boolean[t];
        	int[] team1 = new int[t];
        	int[] team2 = new int[t];
        	int[][] miss = new int[t][p];
        	int[] team3 = new int[t];
        	for(int i=0;i<t;i++){
        		team3[i] = i+1;
        	}
        	for(int i=0;i<r;i++){
        		int tldi = sc.nextInt();
        		int pldi = sc.nextInt();
        		int time = sc.nextInt();
        		String str = sc.next();
        		if(str.compareTo("WRONG")==0){
        			miss[tldi-1][pldi-1]++;
        		}
        		else{
        			team1[tldi-1]++;
        			team2[tldi-1] += miss[tldi-1][pldi-1]*1200+time;
        		}
        	}
        	for(int i=0;i<t;i++){
        		for(int j=i+1;j<t;j++){
        			if(team1[i]<team1[j] || (team1[i]==team1[j] && team2[i]>team2[j]) || (team1[i]==team1[j] && team2[i]==team2[j] && team3[i]>team3[j])){
        				int tmp = team1[i];
        				team1[i] = team1[j];
        				team1[j] = tmp;
        				tmp = team2[i];
        				team2[i] = team2[j];
        				team2[j] = tmp;
        				tmp = team3[i];
        				team3[i] = team3[j];
        				team3[j] = tmp;
        			}
        		}
        	}

        	for(int i=0;i<t;i++){
        		out.println(team3[i]+" "+team1[i]+" "+team2[i]);
        		out.flush();
        	}

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