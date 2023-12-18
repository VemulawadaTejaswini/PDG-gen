import java.util.*;
import java.io.*;

public class Main implements Runnable {
    public static int[] CountingSort(int[] X, int n) {
        int k = X.length;
        int[] Y = new int[k];
        int[] Z = new int[n];
        
        for(int i = 0; i < k; i++) {
            Z[X[i]]++;
        }
        
        for(int i = 1; i < n; i++) {
            Z[i] += Z[i - 1];
        }
        
        for(int j = k - 1; j >= 0; j--) {
            Y[Z[X[j]] - 1] = X[j];
            Z[X[j]]--;
        }
        return Y;
    } 
    
    public void run() {
        FastScanner scanner = new FastScanner();
        int k = (int) scanner.nextLong();
        int[] A = new int[k];
        
        for(int i = 0; i < k; i++) {
            A[i] = (int) scanner.nextLong();
        }
        
        int[] B = CountingSort(A, 10001);
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < k; i++) {
            answer.append(B[i]);
            if(i == k - 1) {
                answer.append("\n");
            } else {
                answer.append(" ");
            }
        }
        System.out.print(answer);
    }
    
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }
} 

class FastScanner {
    private final InputStream input = System.in;
    private final byte[] buffer     = new byte[1024];
    private int ptr    = 0;
    private int buflen = 0;
    
    private boolean hasNextByte() {
        if(ptr < buflen) {
            return true;
        } else {
          ptr = 0;
          try {
              buflen = input.read(buffer);
          } catch(IOException e) {
              e.printStackTrace();
          }
          if(buflen <= 0) {
              return false;
          }
        }
        return true;
    }
    
    private int readByte() {
        if(hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    
    private void skipUnprintable() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }
    
    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }
    
    public String next() {
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder strBuilder = new StringBuilder();
        int b = readByte();
        
        while(isPrintableChar(b)) {
            strBuilder.appendCodePoint(b);
            b = readByte();
        }
        
        return strBuilder.toString();
    }
    
    public long nextLong() {
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-') {
            minus = true;
            b = readByte();
        }
        
        if(b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        
        while(true) {
            if('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            }else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
