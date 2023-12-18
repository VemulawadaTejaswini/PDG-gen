import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

import java.util.*;
 
public class Main implements Runnable{
    String S;
    int N;
    
    public boolean dfs(String s,int a,int b,int c) {
        if(s.equals("ABC"))
            return true;
        if(s.length()<=3)return false; 
        {
            StringBuilder sb = new StringBuilder();
            int na = a,nb = b,nc = c;
            for(int i = 0;i < s.length();i++){
                if(i + 2 < s.length() && s.charAt(i)=='A' && s.charAt(i+1)=='B' && s.charAt(i+2)=='C'){
                    sb.append("A");
                    nb--;
                    nc--;
                    i+=2;
                }else{
                    sb.append(s.charAt(i));
                }
            }
            if(sb.length() >= 3 && nb > 0 && nc > 0){
                if(dfs(sb.toString(),na,nb,nc))return true;
            }
        }
        
        {
            StringBuilder sb = new StringBuilder();
            int na = a,nb = b,nc = c;
            for(int i = 0;i < s.length();i++){
                if(i + 2 < s.length() && s.charAt(i)=='A' && s.charAt(i+1)=='B' && s.charAt(i+2)=='C'){
                    sb.append("B");
                    na--;
                    nc--;
                    i+=2;
                }else{
                    sb.append(s.charAt(i));
                }
            }
            if(sb.length() >= 3 && na > 0 && nc > 0){
                if(dfs(sb.toString(),na,nb,nc))return true;
            }
        }
        
        {
            StringBuilder sb = new StringBuilder();
            int na = a,nb = b,nc = c;
            for(int i = 0;i < s.length();i++){
                if(i + 2 < s.length() && s.charAt(i)=='A' && s.charAt(i+1)=='B' && s.charAt(i+2)=='C'){
                    sb.append("C");
                    na--;
                    nb--;
                    i+=2;
                }else{
                    sb.append(s.charAt(i));
                }
            }
            if(sb.length() >= 3 && na > 0 && nb > 0){
                if(dfs(sb.toString(),na,nb,nc))return true;
            }
        }
        return false;
    }
    
    public void solve() {
        S = next();
        N = S.length();
        int a = 0,b = 0,c = 0;
        for(int i = 0;i < N;i++){
            if(S.charAt(i)=='A'){
                a++;
            }else if(S.charAt(i)=='B'){
                b++;
            }else if(S.charAt(i)=='C'){
                c++;
            }
        }
        
        if(dfs(S,a,b,c))out.println("Yes");
        else out.println("No");
    }
 
    public static void main(String[] args) {
        new Thread(null,new Main(),"",32 * 1024 * 1024).start();
    }
 
    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;
 
    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }
 
    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }
 
    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
    public long nextLong() {
        return Long.parseLong(next());
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
 
    @Override
    public void run() {
        out.flush();
        new Main().solve();
        out.close();
 
    }
}