import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter pw;
    static Scanner sc;
    static int mod;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;
    static long[] dp;
    static long ceildiv(long x, long y) { return (x+y-1)/y; }
    static int mod(long x, int m) { return (int)((x%m+m)%m); }
    static boolean[] arr;
    static long gcd(long x, long y) {return y==0?x:gcd(y, x%y);}
    static int Int(boolean x){ return x?1:0; }
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        if(n<3){
            System.out.println(0);
            return;
        }
        dp=new long[n+1];
        Arrays.fill(dp, -1l);
        dp[0]=1;
        mod=(int)1e9+7;
        pw.println(solve(n));
        pw.close();
    }
    static long solve(int rem){
        if(dp[rem]==-1){
            dp[rem]=1;
            for(int i=3; i<=rem-3; i++)
                dp[rem]=(dp[rem]+solve(rem-i))%mod;
        }
        return dp[rem];
    }
    static void put(TreeMap<Pair, Integer> map, Pair p){
        if(map.containsKey(p))
            map.replace(p, map.get(p)+1);
        else
            map.put(p, 1);
    }
    static void rem(TreeMap<Pair, Integer> map, Pair p){
        if(map.get(p)==1)
            map.remove(p);
        else
            map.replace(p, map.get(p)-1);
    }
    static long pow(long a, long pow){
        long ans=1;
        while(pow>0){
            if((pow&1)==1)
                ans*=a;
            a*=a;
            pow>>=1;
        }
        return ans;
    }
    static int getpow(int x) throws Exception{
        int pow=x;
        pw.println("B "+pow);
        pw.flush();
        sc.next();
        pw.println("B "+pow);
        pw.flush();
        if(sc.nextInt()==1){
            pow*=x;
            while(true){
                pw.println("B "+pow);
                pw.flush();
                if(sc.nextInt()==0)
                    return pow/x;
                pow*=x;
            }
        }else{
            return 1;
        }
    }
    static int[] least;
    static TreeSet<Integer> prime;
    static void linearsieve(int x){
        least=new int[x+1];
        prime=new TreeSet<Integer>();
        for(int i=2; i<=x; i++){
            if(least[i]==0){
                least[i]=i;
                prime.add(i);
            }
            for(int y :prime) {
                if(i*y<=x)
                    least[i*y]=y;
                else break;
            }
        }
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
}