
import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	
    	while(true){
    		int n = sc.nextInt()+1;
    		if(n==1){
    			break;
    		}
    		int[][][] line = new int[n][10][2];
    		boolean[] judge = new boolean[n];
    		Arrays.fill(judge,false);
    		boolean ok = false;
    		int[] m = new int[n];
    		for(int i=0;i<n;i++){
    			m[i] = sc.nextInt();
    			for(int j=0;j<m[i];j++){
    				line[i][j][0] = sc.nextInt();
    				line[i][j][1] = sc.nextInt();
    			}
    		}
    		for(int i=0;i<1;i++){
    			for(int j=i+1;j<n;j++){
    				if(m[i]!=m[j]){
    					continue;
    				}
    				boolean flag = false;
    				for(int k=0;k<m[i]-1;k++){
    						int x = Math.abs(line[i][k][0]-line[i][k+1][0])+Math.abs(line[i][k][1]-line[i][k+1][1]);
    						int y = Math.abs(line[j][k][0]-line[j][k+1][0])+Math.abs(line[j][k][1]-line[j][k+1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=0){
    							int id=-1;
                                int jd=-1;
                                if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][1]<line[i][k+1][1])) ||
                                    ((line[i][k-1][1]<line[i][k][1])&&(line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][0]>line[i][k][0])&&(line[i][k][1]>line[i][k+1][1])) ||
                                    ((line[i][k-1][1]>line[i][k][1])&&(line[i][k][0]<line[i][k+1][0]))){
                                    id = 1;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][1]<line[j][k+1][1])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][1]>line[j][k+1][1])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][0]<line[j][k+1][0]))){
                                    jd = 1;
                                }
                                else{
                                    jd = 2;
                                }
                                if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
                                out.println(i+" "+j+" 1");
    							flag = true;
    						}
    				}
    				for(int k=0;k<m[i]-1;k++){
    						int x = Math.abs(line[i][m[i]-1-k][0]-line[i][m[i]-1-k-1][0])+Math.abs(line[i][m[i]-1-k][1]-line[i][m[i]-1-k-1][1]);
    						int y = Math.abs(line[j][k][0]-line[j][k+1][0])+Math.abs(line[j][k][1]-line[j][k+1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=0){
                                int id=-1;
                                int jd=-1;
                                if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0]))){
                                    id = 1;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][1]<line[j][k+1][1])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][1]>line[j][k+1][1])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][0]<line[j][k+1][0]))){
                                    jd = 1;
                                }
                                else{
                                    jd = 2;
                                }
    							if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
                                out.println(i+" "+j+" 2");
    							flag = true;
    						}
    				}
    				for(int k=0;k<m[i]-1;k++){
    						int x = Math.abs(line[i][k][0]-line[i][k+1][0])+Math.abs(line[i][k][1]-line[i][k+1][1]);
    						int y = Math.abs(line[j][m[i]-1-k][0]-line[j][m[i]-1-k-1][0])+Math.abs(line[j][m[i]-1-k][1]-line[j][m[i]-1-k-1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=0){
    							int id=-1;
                                int jd=-1;
                                if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0]))){
                                    id = 1;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][1]<line[i][k+1][1])) ||
                                    ((line[i][k-1][1]<line[i][k][1]&&line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][0]>line[i][k][0]&&line[i][k][1]>line[i][k+1][1])) ||
                                    ((line[i][k-1][1]>line[i][k][1]&&line[i][k][0]<line[i][k+1][0]))){
                                    jd = 1;
                                }
                                else{
                                    jd = 2;
                                }
    							if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
                                out.println(i+" "+j+" 3");
    							flag = true;
    						}
    				}
    				for(int k=m[i]-1;k>0;k--){
    						int x = Math.abs(line[i][k][0]-line[i][k-1][0])+Math.abs(line[i][k][1]-line[i][k-1][1]);
    						int y = Math.abs(line[j][k][0]-line[j][k-1][0])+Math.abs(line[j][k][1]-line[j][k-1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=m[i]-1){
    							int id=-1;
                                int jd=-1;
                                if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1]&&line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0]&&line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1]&&line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0]))){
                                    id = 1;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0]))){
                                    jd = 1;
                                }
                                else{
                                    jd = 2;
                                }
    							if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
                                out.println(i+" "+j+" 4");
    							flag = true;
    						}
    				}
    				if(flag){
    					judge[i] = true;
    					judge[j] = true;
    					ok = true;
    				}
    			}
    		}
    		if(ok){
    			for(int i=1;i<n;i++){
    				if(judge[i]){
    					out.println(i);
    				}
    			}
    			out.flush();
    		}
    		out.println("+++++");
    		out.flush();
    	}

        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class Reader {

    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.in = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = in.read(buf);
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

    public void close() {try{ in.close();}catch(IOException e){ e.printStackTrace();}};
}