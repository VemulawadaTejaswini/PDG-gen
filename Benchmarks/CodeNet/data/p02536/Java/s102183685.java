import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.*;
import java.math.BigInteger;


public class Main{
    public static FastReader fs = new FastReader();
    static int n,m;
    static ArrayList<Integer>[] adj;
    static boolean[] vis;
    static PrintWriter out = new PrintWriter(System.out);

    static void dfs(int node){
        vis[node] = true;
        for(int ch : adj[node])
            if(!vis[ch])
                dfs(ch);
    }

    static void solve() {
        n = fs.nextInt();m = fs.nextInt();
        vis = new boolean[n];
        adj = new ArrayList[n];
        for(int i = 0; i<n; i++)
            adj[i] = new ArrayList<>();
        for(int i = 0; i<m; i++){
            int x = fs.nextInt()-1,y = fs.nextInt()-1;
            adj[x].add(y);
            adj[y].add(x);
        }
        int count = 0;
        for(int i = 0; i<n; i++){
            if(!vis[i]){
                count += 1;
                dfs(i);
            }
        }
        out.println(count-1);
    }

    public static void main(String[] args) {
        Thread t = new Thread(null,null,"",1 << 28) {
            public void run() {
                int test_case = 1;
                //test_case = fs.nextInt();
                for(int cs = 1; cs <= test_case; cs++) {
                    solve();
                }
                out.close();
            }
        };
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }

        int [] readintarray(int n) {
            int res [] = new int [n];
            for(int i = 0; i<n; i++)res[i] = nextInt();
            return res;
        }
        long [] readlongarray(int n) {
            long res [] = new long [n];
            for(int i = 0; i<n; i++)res[i] = nextLong();
            return res;
        }
    }

    static int ceil(int x,int y) {
        return (x % y == 0 ? x / y : (x / y +1));
    }

    static long ceil(long x,long y) {
        return (x % y == 0 ? x / y : (x / y +1));
    }

    static int max(int x,int y) {
        return Math.max(x, y);
    }

    static int min(int x,int y) {
        return Math.min(x, y);
    }

    static long max(long x,long y) {
        return Math.max(x, y);
    }

    static long min(long x,long y) {
        return Math.min(x, y);
    }

    static int min(int a []) {
        int x = 1_000_000_00_9;
        for(int i = 0; i<a.length; i++)x = min(x,a[i]);
        return x;
    }

    static int max(int a []) {
        int x = -1_000_000_00_9;
        for(int i = 0; i<a.length; i++)x = max(x,a[i]);
        return x;
    }

    static long min(long a []) {
        long x = (long)3e18;
        for(int i = 0; i<a.length; i++)x = min(x,a[i]);
        return x;
    }

    static long max(long a []) {
        long x = -(long)3e18;
        for(int i = 0; i<a.length; i++)x = max(x,a[i]);
        return x;
    }

    static int power(int x,int y) {
        int res = 1;
        while(y > 0) {
            if( y % 2 == 1)res = (res * x);
            y >>= 1;
            x = (x * x);
        }
        return res;
    }

    static long power(long x,long y) {
        long res = 1;
        while(y > 0) {
            if( y % 2 == 1)res = (res * x);
            y >>= 1;
            x = (x * x);
        }
        return res;
    }

    static long power(long x,long y,long mod) {
        long res = 1;
        x %= mod;
        while(y > 0) {
            if( y % 2 == 1)res = (res * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return res;
    }

    static void intsort(int [] a) {
        List<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void longsort(long [] a) {
        List<Long> temp = new ArrayList<Long>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void reverseintsort(int [] a) {
        List<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        Collections.reverse(temp);
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void reverselongsort(long [] a) {
        List<Long> temp = new ArrayList<Long>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        Collections.reverse(temp);
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }


    static void intervalsort(int a [],int start,int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = start; i<end; i++)
            temp.add(a[i]);
        Collections.sort(temp);
        for(int i = 0; i<temp.size(); i++)
            a[i+start] = temp.get(i);
    }

    static void intervalsort(long a [],int start,int end) {
        ArrayList<Long> temp = new ArrayList<>();
        for(int i = start; i<end; i++)
            temp.add(a[i]);
        Collections.sort(temp);
        for(int i = 0; i<temp.size(); i++)
            a[i+start] = temp.get(i);
    }

    static void reverseintervalsort(int a [],int start,int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = start; i<end; i++)
            temp.add(a[i]);
        Collections.sort(temp);
        Collections.reverse(temp);
        for(int i = 0; i<temp.size(); i++)
            a[i+start] = temp.get(i);
    }

    static void reverseintervalsort(long a [],int start,int end) {
        ArrayList<Long> temp = new ArrayList<>();
        for(int i = start; i<end; i++)
            temp.add(a[i]);
        Collections.sort(temp);
        Collections.reverse(temp);
        for(int i = 0; i<temp.size(); i++)
            a[i+start] = temp.get(i);
    }
}