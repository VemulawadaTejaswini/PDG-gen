import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]a = sc.nextIntArr(n);
        int[]b = sc.nextIntArr(n);
        int[]c1= new int[n+1];
        int[]c2= new int[n+1];
        Stack<Integer>[]ids= new Stack[n+1];
        for (int i =0;i<=n;i++)ids[i]=new Stack<>();
        TreeSet<int[]>as= new TreeSet<>((x,y)->x[0]==y[0]?x[1]-y[1]:x[0]-y[0]);
        TreeSet<int[]>bs= new TreeSet<>((x,y)->x[0]==y[0]?x[1]-y[1]:x[0]-y[0]);
        boolean valid=true;
        for (int i =0;i<n;i++){
            c1[a[i]]++;
            c2[b[i]]++;
            as.add(new int[]{a[i],i});
            bs.add(new int[]{b[i],i});
            ids[b[i]].add(i);
        }
        for (int i =1;i<=n;i++){
            if (c1[i]+c2[i]>n)
                valid=false;
        }
        int[]ans = new int[n];
        while (!as.isEmpty()){
            Stack<int[]>cur = new Stack<>();
            cur.add(as.pollFirst());
            int v= cur.peek()[0];
            while (!as.isEmpty()&&as.first()[0]==cur.peek()[0])cur.add(as.pollFirst());
            while (!cur.isEmpty()){
                if (bs.first()[0]!=v){
                    int[] cc= bs.pollFirst();
                    ans[cur.pop()[1]]=cc[0];
                }
                else {
                    int[] cc= bs.pollLast();
                    ans[cur.pop()[1]]=cc[0];
                }
            }
            while (!ids[v].isEmpty()){
                int[]aa = new int[]{v,ids[v].pop()};
                if (!bs.contains(aa))
                    continue;
                bs.remove(aa);
                ans[as.pollFirst()[1]]=v;
            }
        }
        if (!valid){
            pw.println("No");
        }
        else {
            pw.println("Yes");
            for (int i =0;i<n;i++)
                pw.print(ans[i]+" ");
            pw.println();
        }
        pw.flush();
    }
        static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
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