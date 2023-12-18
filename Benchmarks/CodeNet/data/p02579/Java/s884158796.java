
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;

import static java.lang.String.format;


public class Main {
    private static final String PAIRWISE = "pairwise coprime";
    private static final String SETWISE = "setwise coprime";
    private static final String NOT = "not coprime";
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};
    private static final int INF = Integer.MAX_VALUE >> 4;
    public static void main(String[] args) {
        Scanner scanner=new Scanner();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int ch = scanner.nextInt()-1;
        int cw = scanner.nextInt()-1;
        int dh = scanner.nextInt()-1;
        int dw = scanner.nextInt()-1;
        boolean[][] isWall = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            String s = scanner.next();
            for (int j = 0; j < w; j++) {
                isWall[i][j] = s.charAt(j) == '#';
            }
        }
        Deque<Container<Integer>> deq = new ArrayDeque<>();
        deq.add(new Container(new FixedPair(ch, cw),0));
        int[][] ans = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(ans[i], INF);
        }
        while (!deq.isEmpty()) {
            Container<Integer> current = deq.removeFirst();
//            put(current.point);
            if(ans[current.point.x][current.point.y]<= current.value)continue;
            ans[current.point.x][current.point.y] = current.value;
            for (int i = 0; i < 4; i++) {
                FixedPair next = new FixedPair(current.point().x + dx[i], current.point.y + dy[i]);
                if(next.x<0||next.x>=h||next.y<0||next.y>=w)continue;
                if(isWall[next.x][next.y])continue;
                if(current.value>=ans[next.x][next.y])continue;
                var nextC = new Container<>(next, current.value);
//                put(String.format("%sをdeqに追加します", nextC));
                deq.addLast(nextC);
            }
            for (int i = -2; i <=2; i++) {
                for (int j = -2; j <= 2; j++) {
                    FixedPair next = new FixedPair(current.point.x + i, current.point.y + j);
                    if(next.x<0||next.x>=h||next.y<0||next.y>=w)continue;
                    if(isWall[next.x][next.y])continue;
                    if(current.value+1>=ans[next.x][next.y])continue;
                    deq.addLast(new Container<>(next,current.value+1));
                }
            }
        }
//        put(Arrays.deepToString(ans));

        put(ans[dh][dw] ==INF ? -1 : ans[dh][dw]);

    }
    static class Container<T>{
        FixedPair point;
        T value;

        public Container(FixedPair p, T value) {
            this.point = p;
            this.value = value;
        }
        public FixedPair point(){return point;}
        public T value(){return value;}

        @Override
        public String toString() {
            return String.format("%s->%s",point,value);
        }
    }
    interface EnterExit extends Runnable{
        void enter();
        void exit();
        static Runnable build(EnterExit ee){
            return ()->{
                ee.enter();
                ee.run();
                ee.exit();
            };
        }
        default Runnable build(){return build(this);}
        static EnterExit measureTime(Runnable r){
            return new EnterExit() {
                private long enter;
                @Override
                public void enter() {
                    this.enter = System.currentTimeMillis();
                }

                @Override
                public void exit() {
                    put(System.currentTimeMillis()-enter+"[ms]");
                }

                @Override
                public void run() {
                    r.run();
                }
            };
        }
    }
    static class PrimeTable {
        private final int[] divisor;
        private final List<Integer> primes = new ArrayList<>();

        public PrimeTable(int n) {
            this.divisor = new int[n];
            for (int i = 2; i < n; i++) {
                if (divisor[i] != 0) continue;
                divisor[i] = i;
                primes.add(i);
                for (int j = i + i; j < n; j += i) {
                    if (divisor[j] == 0) divisor[j] = i;
                }
            }
        }

        public Map<Integer, Integer> primeFactorize(int x) {
            Map<Integer, Integer> res = new HashMap<>();
            while (divisor[x] != 0) {
                res.merge(divisor[x], 1, Integer::sum);
                x /= divisor[x];
            }
            return res;
        }

        @Override
        public String toString() {
            return Arrays.toString(divisor) + ":" + primes;
        }
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
    public static <T> int upper_bound(T[] a,int l,int r,T val,Comparator<T> comparator){
        if(r-l==1){
            if(comparator.compare(a[l],val)>0) return l;
            return r;
        }
        int mid=(l+r)/2;
        if(comparator.compare(a[mid],val)>0){
            return upper_bound(a,l,mid,val,comparator);
        }else{
            return upper_bound(a,mid,r,val,comparator);
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

    public static <T> int lower_bound(T[] a,int l,int r,T val,Comparator<T> comparator){
        if(r-l==1){
            if(comparator.compare(a[l],val)<0) return r;
            return l;
        }
        int mid=(l+r)/2;
        if(comparator.compare(a[mid],val)<0){
            return lower_bound(a,mid,r,val,comparator);
        }else{
            return lower_bound(a,l,mid,val,comparator);
        }
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

    final static private class Scanner {
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
    final static private class FixedPair {
        final private int x, y;
        final static public FixedPair ZEROS=new FixedPair(0,0);
        FixedPair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int hashCode() {
            return (int)x+(int)y;
        }

        @Override
        public boolean equals(Object obj) {
            boolean result=super.equals(obj);
            if(obj.getClass()!=this.getClass()){
                return false;
            }
            FixedPair pair=(FixedPair)obj;
            if(this.x==pair.x&&this.y==pair.y) return true;
            return false;
        }

        @Override
        public String toString() {
            return String.format("(%d,%d)", x, y);
        }
    }
    final static private class Tuple<T,V>{
        //immutabl1でないことに注意(T,Vがmutableの場合変更可能)
        final private T t;
        final private V v;
        Tuple(T t,V v){
            this.t=t;
            this.v=v;
        }

        public T getT() {
            return t;
        }

        public V getV() {
            return v;
        }

        @Override
        public int hashCode() {
            return (t.hashCode()+v.hashCode());
        }

        @Override
        @SuppressWarnings("unchecked")
        public boolean equals(Object obj) {
            if(obj.getClass()!=this.getClass()){
                return false;
            }
            Tuple<T,V> tuple=(Tuple<T, V>) obj;
            return tuple.t.equals(this.t)&&tuple.v.equals(this.v);
        }

        @Override
        public String toString() {
            return String.format("<Tuple>=<%s,%s>",t,v);
        }
    }
    final static private class Util {
        static long gcd(long a,long b){
            //最大公約数　
            if(a%b==0)return b;
            return gcd(b,a%b);
        }

        static int gcd(int a, int b) {
            if(a%b==0)return b;
            return gcd(b, a % b);
        }
        static long lcm(long a,long b){
            //最小公倍数
            long gcd=gcd(a,b);
            long result=b/gcd;
            return a*result;
        }
        static long kaijoMod(int n,int mod){
            if(n<1) return -1;
            long result=1;
            for(int i=n;i>1;i--){
                result*=i;
                result%=mod;
            }
            return result;
        }
        static <T extends Comparable<T>> Map<T,Integer> count(List<T> list){
            //副作用
            Collections.sort(list);
            Map<T,Integer> result=new HashMap<>();
            int l=0,r=0;
            while(l<list.size()){
                while(r<list.size()-1&&list.get(r).equals(r+1)){
                    r++;
                }
                result.put(list.get(r),r-l+1);
                r++;
                l=r;
            }
            return result;

        }
        static Map<Integer,Integer> count(int[] array){
            //副作用
            Arrays.sort(array);
            Map<Integer,Integer> result=new HashMap<>();
            int l=0,r=0;
            while(l<array.length){
                while(r<array.length-1&&array[r]==array[r+1]){
                    r++;
                }
                result.put(array[l],r-l+1);
                r++;
                l=r;
            }
            return result;
        }
        static <T> String toStringBWS(Iterable<T> iterable){
            Iterator<T> ite=iterable.iterator();
            return toStringBWS(ite);
        }
        static <T> String toStringBWS(Iterator<T> ite){
            StringBuilder sb=new StringBuilder();
            sb.append(ite.next());
            while(ite.hasNext()){
                sb.append(" ");
                sb.append(ite.next());
            }
            return sb.toString();
        }
        static int[] factoringInPrimeNumbers(long n,int size){
            //素因数分解
            //sizeがnに比べて小さい場合完全に素因数分解出来ていない可能性がある
            int[] result=new int[size];
            for(int i=2;n>1&&i< result.length;i++){
                while(n%i==0){
                    result[i]++;
                    n/=i;
                }
            }
            return result;

        }
    }
}
