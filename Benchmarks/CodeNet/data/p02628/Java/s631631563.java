import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static MyScanner scan;
    public static PrintWriter out;
    public static void main(String[] args) {
        scan=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));

        int t=1;
//        int t=scan.nextInt();
        while(t-->0) {

            int n=scan.nextInt(),k=scan.nextInt();
            int[] a=nextIntArray(n);

            Arrays.sort(a);
            int sum=0;
            for(int c=0;c<k;c++) {
                sum+=a[c];
            }
            out.println(sum);
        }
        out.close();
    }

    //-----------------------------------------------------COMP-SPACE-----------------------------------------------------



    //--------------------------------------------------------------------------------------------------------------------

    //node
    static class Node implements Comparable<Node> {
        public int x,y;
        public Node(int x,int y) {
            this.x=x;
            this.y=y;
        }

        public int compareTo(Node other) {
            if(this.x==other.x) return 0;
            else if(this.x>other.x) return 1;
            else return -1;
        }

        public boolean equals(Node other) {
            return this.x==other.x;
        }

//        public int compareTo(Node other) {
//            if(this.y==other.y) return 0;
//            else if(this.y>other.y) return 1;
//            else return -1;
//        }
//
//        public boolean equals(Node other) {
//            return this.y==other.y;
//        }
    }
    //edge
    static class Edge implements Comparable<Edge> {
        public Node a,b;
        public int weight;

        public Edge(Node a,Node b,int weight) {
            this.a=a;
            this.b=b;
            this.weight=weight;
        }

        public int compareTo(Edge other) {
            if(this.weight==other.weight) return 0;
            else if(this.weight>other.weight) return 1;
            else return -1;
        }
    }

    //util
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        if (a == 0)
            return b;
        return (a > b) ? gcd(a % b, b) : gcd(a, b % a);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int min(int a,int b) {
        if(a<=b) return a;
        else return b;
    }

    public static int max(int a,int b) {
        if(a>=b) return a;
        else return b;
    }

    public static int abs(int a) {
        if(a<0) return a*-1;
        else return a;
    }

    public static ArrayList<Integer> getPrimes(int n) {
        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime,true);
        for (int p=2;p*p<=n;p++) {
            if (prime[p]) {
                for (int i=p*2;i<=n;i+=p) {
                    prime[i]=false;
                }
            }
        }
        ArrayList<Integer> primeNumbers=new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int a) {
        if (a == 0 || a == 1) {
            return false;
        }
        if (a == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(a) + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> div = new ArrayList<Integer>();
        for (int i=1;i*i<=n;i++) {
            if (n%i==0) {
                div.add(i);
                if (n/i!=i)
                    div.add(n/i);
            }
        }
        return div;
    }

    //scanner
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static int[] nextIntArray(int n) {
        int[] a=new int[n];
        for(int c=0;c<n;c++) a[c]=scan.nextInt();
        return a;
    }

    public static Integer[] nextIntegerArray(int n) {
        Integer[] a=new Integer[n];
        for(int c=0;c<n;c++) a[c]=scan.nextInt();
        return a;
    }

    public static int[][] nextIntMatrix(int n,int m) {
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) a[i][j]=scan.nextInt();
        return a;
    }

    public static Integer[][] nextIntegerMatrix(int n,int m) {
        Integer[][] a=new Integer[n][m];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) a[i][j]=scan.nextInt();
        return a;
    }

    //print
    public static void printIntArray(int[] a) {
        for(int c:a) out.print(c+" ");
        out.println();
    }

    public static void printIntegerArray(Integer[] a) {
        for(int c:a) out.print(c+" ");
        out.println();
    }

    public static void printIntMatrix(int[][] a) {
        for(int[] i:a) {
            for(int j:i) out.print(j+" ");
            out.println();
        }
    }

    public static void printIntegerMatrix(Integer[][] a) {
        for(Integer[] i:a) {
            for(Integer j:i) out.print(j+" ");
            out.println();
        }
    }

    public static void help(int t,int n) { out.println("Test Case: "+(t+1)+" | Variable Output: "+n); }
    public static void help(int t,String n) { out.println("Test Case: "+(t+1)+" | Variable Output: "+n); }
    public static void help(int t,char[] n) { out.print("Test Case: "+(t+1)+" | Variable Output: "); for(char c:n) out.print(c+" "); out.println(); }
}