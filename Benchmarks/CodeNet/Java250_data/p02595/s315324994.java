import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter pw;
    static Scanner sc;
    static long ceildiv(long x, long y) { return (x+y-1)/y; }
    static int mod(long x, int m) { return (int)((x%m+m)%m); }
    static void put(TreeMap<Integer, Integer> map, Integer p){if(map.containsKey(p)) map.replace(p, map.get(p)+1); else map.put(p, 1); }
    static void rem(TreeMap<Integer, Integer> map, Integer p){ if(map.get(p)==1) map.remove(p);else map.replace(p, map.get(p)-1); }
    static long gcd(long x, long y) {return y==0?x:gcd(y, x%y);}
    static int Int(boolean x){ return x?1:0; }
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        pw=new PrintWriter(System.out);
        int n=sc.nextInt(), d=sc.nextInt();
        Pair[] arr=sc.nextPairArr(n);
        int ans=0;
        for(int i=0; i<n; i++){
            double x=Math.sqrt(sq(arr[i].x)+sq(arr[i].y));
            ans+=Int(x<=d);
        }
        pw.println(ans);
        pw.close();
    }
    static long sq(int x){
        return x*1l*x;
    }
    static long[] fact;
    static int modInv(int x, int mod){
        return Euclid(x, mod).x;
    }
    static Main.Pair Euclid(int x, int y){
        if(y==0)
            return new Main.Pair(1, 0);
        Main.Pair p=Euclid(y, x%y);
        int a=p.y, b=(int)(p.x-p.y*1l*(x/y));
        return new Main.Pair(a, b);
    }
    static long Pow(long a, int e, int mod) {
        a %= mod;
        long res = 1;
        while (e > 0) {
            if ((e & 1) == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            e >>= 1;
        }
        return res;
    }
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            pw.print(arr[i] + " ");
        pw.println(arr[arr.length - 1]);
    }
    static void printArr(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            pw.print(arr[i] + " ");
        pw.println(arr[arr.length - 1]);
    }
    static void printArr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++)
            pw.print(arr[i] + " ");
        pw.println();
    }
    static void printArr(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            pw.print(arr[i]==0? '1': arr[i]);
        pw.println();
    }
    static void printArr(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            pw.print(list.get(i)+" ");
        pw.println();
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }
        public Integer[] nextsort(int n) throws IOException{
            Integer[] arr=new Integer[n];
            for(int i=0; i<n; i++)
                arr[i]=nextInt();
            return arr;
        }
        public Pair nextPair() throws IOException{
            return new Pair(nextInt(), nextInt());
        }
        public Pair[] nextPairArr(int n) throws IOException{
            Pair[] arr=new Pair[n];
            for(int i=0; i<n; i++)
                arr[i]=nextPair();
            return arr;
        }
        public boolean ready() throws IOException {
            return br.ready();
        }
    }
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x=x;
            this.y=y;
        }
        public int hashCode() {
            return (this.x*1000+this.y);
        }
        public int compareTo(Pair p){
            int min1=Math.min(x, y), min2=Math.min(p.x, p.y);
            if(min1!=min2)
                return min1-min2;
            if(x==p.x)
                return y-p.y;
            return x-p.x;
        }
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            Pair p = (Pair) obj;
            return this.x==p.x && this.y==p.y;
        }
        public Pair clone(){
            return new Pair(x, y);
        }
        public String toString(){
            return this.x+" "+this.y;
        }
        public void add(Pair p){
            x+=p.x;
            y+=p.y;
        }
    }
    static class Union{
        int[] rep, size;
        int sets;
        public Union(int n){
            rep=new int[n];
            size=new int[n];
            sets=n;
            Arrays.fill(size, 1);
            for(int i=0; i<n; i++)
                rep[i]=i;
        }
        public void join(int x, int y){
            int a=getSet(x), b=getSet(y);
            if(a==b) return;
            sets--;
            if(size[a]>size[b]){
                rep[b]=a;
                size[a]+=size[b];
            }else{
                rep[a]=b;
                size[b]+=size[a];
            }
        }
        public int getSet(int x){
            if(rep[x]==x)
                return x;
            return rep[x]=getSet(rep[x]);
        }
    }
}