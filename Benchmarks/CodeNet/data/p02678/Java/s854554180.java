import java.io.*;
import java.util.*;



public class Main {

    static MyScanner ob = new MyScanner();
    static   PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static int N ;
    static int [] A;
     static char[][] arr = new char[100][1000];
    public static void main(String args[]) throws IOException {
        int N = ob.nextInt(); int M = ob.nextInt();
        ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>(N+1);
        for(int i=0;i<=N;i++){
            g.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            int u  = ob.nextInt();
            int v = ob.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        int [] dis = new int[N+1];
        Arrays.fill(dis, 1000000);
        dis[1] = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int i=0;i<g.get(u).size();i++){
                int v = g.get(u).get(i);
                if(dis[u]+1<dis[v]){
                    dis[v] = dis[u]+1;
                    q.add(v);
                }
            }
        }
        String line = "";
        int max = 1000000;
        boolean yes = true;
        for(int i=2;i<=N;i++){
            if(dis[i]==max){
                    yes = false;
            }
        line+=((dis[i])+"\n");
        }
       if(yes){
           pw.print("YES\n");
           pw.print(line);
       }else{
           pw.print("NO");
       }
        pw.flush();
        
    }

  
    static boolean check (int i, int j,int n ,int m){
        if(j+1<m){
            if(arr[i][j]=='.'&&arr[i][j+1]=='.'){
                return true;
            }
            return false;
        }
        return false;
    }
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
   
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
  
     }
}