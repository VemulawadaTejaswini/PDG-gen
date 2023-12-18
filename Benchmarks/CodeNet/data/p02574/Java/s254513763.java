import java.io.*;
import java.io.IOException;
import java.util.*;


//import javafx.util.Pair; 
//import java.util.concurrent.LinkedBlockingDeque;







    
  public class Main {
     
        
        public static long mod = (long)Math.pow(10,9)+7 ;
        public static double epsilon=0.00000000008854;//value of epsilon
        public static InputReader sc = new InputReader(System.in);
        public static PrintWriter pw = new PrintWriter(System.out);
        
        // fun(n,sum)=fun(n-1,sum)+fun(n-1,sum-n^x);
        
        public static long pow(long x,long y,long mod){
            long ans=1;
            
            x%=mod;
            while(y>0){
                if((y&1)==1){
                    ans=(ans*x)%mod;
                }
                y=y>>1;
                x=(x*x)%mod;
            }
            return ans;
        }
        public static int find(int a,int p[]){
            if(p[a]!=a){
                p[a]=find(p[a], p);
            }
            return p[a];
        }
        public static void union(int a,int b,int p[],int size[]){
            int pa=find(a, p);
            int pb=find(b, p);
            if(pa!=pb){
                //pw.println(pa+" "+pb);
                p[pa]=pb;
                size[pb]+=size[pa];
            }
        }
        public static boolean [] sieveOfEratosthenes(int n) 
        { 
            // Create a boolean array "prime[0..n]" and initialize 
            // all entries it as true. A value in prime[i] will 
            // finally be false if i is Not a prime, else true. 
            boolean prime[] = new boolean[n+1]; 
            Arrays.fill(prime, true);
            
            for(int p = 2; p*p <=n; p++) 
            { 
                // If prime[p] is not changed, then it is a prime 
                if(prime[p] == true) 
                { 
                    // Update all multiples of p 
                    for(int i = p*p; i <= n; i += p) 
                        prime[i] = false; 
                } 
            }
            return prime;
        }
        public static void main(String[] args) {
            // code starts..
           int  n=sc.nextInt();
           int a[]=scanArray(n);
           int h[]=new int[1000001];
           boolean[]prime = sieveOfEratosthenes(1000001);
           for(int i=0;i<n;i++){
               int t=a[i];
               for(int j=2;j*j<=t;j++){
                   if(prime[t]){
                       t/=t;
                       h[t]++;
                   }
                   if(t%j==0){
                       h[j]++;
                        while(t%j==0){
                            t/=j;
                        }
                   }
               }
               if(t>1){
                h[t]++;
               }
           }
           int f=0;
           for(int i=2;i<1000001;i++){
            if(h[i]==n){
                f=1;
                break;
            }
            if(h[i]>1){
                f=2;
            }
            
           }
           if(f==0){
               pw.println("pairwise coprime");
           }
           else if(f==2){
               pw.println("setwise coprime");
           }
           else{
                pw.println("not coprime");
           }

           
            // Code ends...
            pw.flush();
            pw.close();
        }
       
        public static Comparator<Long[]> column(int i){
            return 
            new Comparator<Long[]>() {
                @Override
                public int compare(Long[] o1, Long[] o2) {
                    return o1[i].compareTo(o2[i]);//for ascending
                    //return o2[i].compareTo(o1[i]);//for descending
                }
            };
        }
        public static Comparator<Integer[]> col(int i){
            return 
            new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[i].compareTo(o2[i]);//for ascending
                    //return o2[i].compareTo(o1[i]);//for descending
                }
            };
        }
        
        
        
        
        public static String reverseString(String s){
            StringBuilder input1 = new StringBuilder(); 
            input1.append(s);  
            input1 = input1.reverse();
            return input1.toString();
        }
        public static int[] scanArray(int n){
            int a[]=new int [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    
            return a;
        }
        public static long[] scanLongArray(int n){
            long a[]=new long [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
    
            return a;
        }
        public static String [] scanStrings(int n){
            String a[]=new String [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextLine();
    
            return a;
        }
        public static class InputReader {
    
            private final InputStream stream;
            private final byte[] buf = new byte[8192];
            private int curChar, snumChars;
            private SpaceCharFilter filter;
    
            public InputReader(InputStream stream) {
                this.stream = stream;
            }
    
            public int snext() {
                if (snumChars == -1)
                    throw new InputMismatchException();
                if (curChar >= snumChars) {
                    curChar = 0;
                    try {
                        snumChars = stream.read(buf);
                    } catch (IOException e) {
                        throw new InputMismatchException();
                    }
                    if (snumChars <= 0)
                        return -1;
                }
                return buf[curChar++];
            }
    
            public int nextInt() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                    sgn = -1;
                    c = snext();
                }
                int res = 0;
                do {
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    res *= 10;
                    res += c - '0';
                    c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
            }
    
            public long nextLong() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                    sgn = -1;
                    c = snext();
                }
                long res = 0;
                do {
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    res *= 10;
                    res += c - '0';
                    c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
            }
    
            public int[] nextIntArray(int n) {
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = nextInt();
                }
                return a;
            }
    
            public String readString() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                StringBuilder res = new StringBuilder();
                do {
                    res.appendCodePoint(c);
                    c = snext();
                } while (!isSpaceChar(c));
                return res.toString();
            }
    
            public String nextLine() {
                int c = snext();
                while (isSpaceChar(c))
                    c = snext();
                StringBuilder res = new StringBuilder();
                do {
                    res.appendCodePoint(c);
                    c = snext();
                } while (!isEndOfLine(c));
                return res.toString();
            }
    
            public boolean isSpaceChar(int c) {
                if (filter != null)
                    return filter.isSpaceChar(c);
                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
            }
    
            private boolean isEndOfLine(int c) {
                return c == '\n' || c == '\r' || c == -1;
            }
    
            public interface SpaceCharFilter {
                public boolean isSpaceChar(int ch);
            }
        }
        
    }
    
    
    
        
    