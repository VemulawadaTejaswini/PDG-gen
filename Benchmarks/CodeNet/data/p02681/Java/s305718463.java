/***
 *    ██████╗=====███████╗====███████╗====██████╗=
 *    ██╔══██╗====██╔════╝====██╔════╝====██╔══██╗
 *    ██║==██║====█████╗======█████╗======██████╔╝
 *    ██║==██║====██╔══╝======██╔══╝======██╔═══╝=
 *    ██████╔╝====███████╗====███████╗====██║=====
 *    ╚═════╝=====╚══════╝====╚══════╝====╚═╝=====
 *    ============================================
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class Solution implements Runnable {

    public void run() {
        InputReader sc = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int i=0,j=0,k=0,t=0;//sc.nextInt();
        for(int testcase = 0; testcase < t; testcase++)
        {

        }
        char a[]=sc.next().toCharArray();
        char b[]=sc.next().toCharArray();
        if (a.length<b.length)
        {
            boolean same=true;
            for (i=0;i<a.length;i++)
            {
                if (a[i]!=b[i])
                {
                    same=false;
                    break;
                }
            }
            if (same)
                out.println("Yes");
            else
                out.println("No");

        }
        else
            out.println("No");



//================================================================================================================================
        out.close();
    }


//================================================================================================================================

    public static long gcd(long a,long b){
        return (a%b==0l)?b:gcd(b,a%b);
    }

    public static void scanArr(int arr[],int n,InputReader sc)
    {
        int i;
        for (i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    public int countChar(String str, char c)
    {
        int count = 0;
        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }
        return count;
    }
    static int binSearch(Integer[] arr, int number){
        int left=0,right=arr.length-1,mid=(left+right)/2,ind=0;
        while(left<=right){
            if(arr[mid]<=number){
                ind=mid+1;
                left=mid+1;
            }
            else
                right=mid-1;
            mid=(left+right)/2;
        }
        return ind;
    }
    static int binSearch(int[] arr, int number){
        int left=0,right=arr.length-1,mid=(left+right)/2,ind=0;
        while(left<=right){
            if(arr[mid]<=number){
                ind=mid+1;
                left=mid+1;
            }
            else
                right=mid-1;
            mid=(left+right)/2;
        }
        return ind;
    }
    static class Pair
    {
        int a,b;
        Pair(int aa,int bb)
        {
            a=aa;
            b=bb;
        }
        String get()
        {
            return a+" "+b;
        }
        String getrev()
        {
            return b+" "+a;
        }
    }

    static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
    static long factorial(long n)
    {
        if (n == 0)
            return 1;
        return n*factorial(n-1);
    }
//================================================================================================================================

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars==-1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }

                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();

            while(isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\n' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new Solution(),"Main",1<<27).start();
    }
}
