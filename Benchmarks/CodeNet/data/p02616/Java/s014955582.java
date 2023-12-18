import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter pw;
    static Scanner sc;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;
    static HashMap<Pair, Integer> dp;
    static long ceildiv(long x, long y) { return (x+y-1)/y; }
    static int mod(long x, int m) { return (int)((x%m+m)%m); }
    static HashMap<Integer, Integer> map;
    static long gcd(long x, long y) {return y==0?x:gcd(y, x%y);}
    static int Int(boolean x){ return x?1:0; }
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        pw = new PrintWriter(System.out);
        int n=sc.nextInt(), k=sc.nextInt();
        Integer[] arr=sc.nextsort(n);
        Arrays.sort(arr);
        int mod=(int)1e9+7;
        if(k%2==0){
            long ans=1l;
            for(int i=0, j=n-1, c=0; c<k/2; c++){
                if(arr[i]*1l*arr[i+1]>arr[j]*1l*arr[j-1]){
                    ans=mod(arr[i++]*ans, mod);
                    ans=mod(arr[i++]*ans, mod);
                }else{
                    ans=mod(arr[j--]*ans, mod);
                    ans=mod(arr[j--]*ans, mod);
                }
            }
            pw.println(ans);
        }else{
            if(arr[n-1]==0){
                pw.println(0);
                pw.close();
                return;
            }
            if(arr[n-1]>0){
                long ans=arr[n-1];
                for(int i=0, j=n-2, c=0; c<k/2; c++){
                    if(arr[i]*1l*arr[i+1]>arr[j]*1l*arr[j-1]){
                        ans=mod(arr[i++]*ans, mod);
                        ans=mod(arr[i++]*ans, mod);
                    }else{
                        ans=mod(arr[j--]*ans, mod);
                        ans=mod(arr[j--]*ans, mod);
                    }
                }
                pw.println(ans);
            }else{
                long ans=1l;
               for(int i=0; i<k; i++)
                   ans=mod(arr[n-1-i]*ans, mod);
               pw.println(ans);
            }
        }
        pw.close();
    }
    static void fill(int[] arr, int x){
        for(int i=0; i<30; i++)
            arr[i]+=Int(((1<<i)&x)!=0);
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
            if(this.y!=p.y)
                return this.y-p.y;
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
