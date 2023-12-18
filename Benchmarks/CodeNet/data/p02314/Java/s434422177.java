import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] c=new int[m];
        for(int i=0;i<m;i++){
            c[i]= scanner.nextInt();
        }
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<=n;j++){
                if(j-c[i]<0)continue;
                dp[j]=Math.min(dp[j],dp[j-c[i]]+1);
            }
            //put(Arrays.toString(dp));
        }
        put(dp[n]);


    }

    public static int upper_bound(int[] a,int val){
        return upper_bound(a,0,a.length,val);
    }
    public static int upper_bound(int[] a,int l,int r,int val){
        if(r-l==1){
            if(a[l]>val) return l;
            return r;
        }
        int mid=(l+r)/2;
        if(a[mid]>val){
            return upper_bound(a,l,mid,val);
        }else{
            return upper_bound(a,mid,r,val);
        }
    }
    public static int lower_bound(int[] a,int val){
        return lower_bound(a,0,a.length,val);
    }
    public static int lower_bound(int[] a,int l,int r,int val){
        if(r-l==1){
            if(a[l]<val) return r;
            return l;
        }
        int mid=(l+r)/2;
        if(a[mid]<val){
            return lower_bound(a,mid,r,val);
        }else{
            return lower_bound(a,l,mid,val);
        }

    }


    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static long max(long a,long b){
        return Math.max(a,b);
    }
    public static int abs(int a){
        return Math.abs(a);
    }
    public static long abs(long a){
        return Math.abs(a);
    }
    public static void print(Object object){
        System.out.print(object);
    }
    public static void put(Object object) {
        System.out.println(object);
    }
    public static void put(){
        System.out.println();
    }
    public static String format(String string, Object... args) {
        return String.format(string, args);
    }
}

final class Scanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
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

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
