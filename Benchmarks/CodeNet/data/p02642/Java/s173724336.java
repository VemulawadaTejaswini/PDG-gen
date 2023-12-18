import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] as = new int[n];
		int[] count = new int[1000001];
		boolean[] hantei = new boolean[1000001];
		for(int i=0; i<n; i++){
			as[i] = sc.nextInt();
			count[as[i]]++;
		}
		for(int i=0; i<n; i++){
			if(count[as[i]] >= 2){
				int j = 2;
				int tmp = as[i];
				while(tmp <= 1000000){
					hantei[tmp] = true;
					tmp = as[i]*j;
					j++;
				}
			} else if(count[as[i]] >= 1){
				int j = 2;
				int tmp = as[i]*j;
				while(tmp <= 1000000){
					hantei[tmp] = true;
					j++;
					tmp = as[i]*j;
				}
			}
		}
		int ans = 0;
		for(int a: as){
			if(!hantei[a]) ans++;
		}
		System.out.println(ans);

	}
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
