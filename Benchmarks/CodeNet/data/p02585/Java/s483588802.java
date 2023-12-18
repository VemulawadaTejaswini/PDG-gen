import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>>cycles;
    static ArrayList<Long>cost;
    static boolean[]vis;
    static int[]c,a;
    static void dfs(int i,long cos,ArrayList<Integer>cur){
        cos+=c[i];
        cur.add(i);
        vis[i]=true;
        if (vis[a[i]]) {
           cycles.add(cur);
           cost.add(cos);
        }
        else {
            dfs(a[i],cos,cur);
        }
    }
    static long calcbest(int op,ArrayList<Integer>here,long all){
        long ans=-(long)1e18;
        for (int i =0;i<here.size();i++){
            int j = i;
            j++;
            j%=here.size();
            long cur= c[here.get(i)];
            int cc=1;
            ans=Math.max(ans,cur);
            ans=Math.max(ans,cur+(all)*((op-cc)/here.size()));
            while (j!=i){
                cc++;
                if (cc>op)
                    break;
                cur+=c[here.get(j)];
                ans=Math.max(ans,cur);
                ans=Math.max(ans,cur+(all)*((op-cc)/here.size()));
                j++;
                j%=here.size();
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        a= sc.nextIntArr(n);
        c= sc.nextIntArr(n);
        for (int i =0;i<n;i++)a[i]--;
        cycles= new ArrayList<>();
        cost= new ArrayList<>();
        vis= new boolean[n];
        for (int i =0;i<n;i++){
            if (!vis[i])
                dfs(i,0,new ArrayList<>());
        }
        long ans = (long)-1e18;
        for (int i =0;i<cycles.size();i++){
            ans=Math.max(ans,calcbest(k,cycles.get(i),cost.get(i)));
        }
//        System.err.println(cycles);
//        System.err.println(cost);
        pw.println(ans);
        pw.close();

    }



    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
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

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}