import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N, M; {int[] a = in.ii(); N = a[0]; M = a[1];}
        MyGraph graph = new MyGraph(N, M);
        int[] parent = graph.bfs(1);
        StringBuilder ans = new StringBuilder("Yes\n");
        for (int i = 2; i < parent.length; i++) {
            if (parent[i] == 0) {
                out.println("No");
                return;
            }
            ans.append(parent[i]).append('\n');   
        }
        out.print(ans);
    }

    static class MyGraph{
        int V; // 頂点数
        int E; // 辺数
        ArrayList<Integer>[] T; // 連結関数
        final static int INF = Integer.MAX_VALUE;

        MyGraph(int V, int E){
            this.V = V;
            this.E = E;
            T = new ArrayList[V+1];
            for(int i = 1; i <= V; i++){
                T[i] = new ArrayList<>();
            }
            for(int i = 0; i < E; i++){
                int u, v; {int[] a = in.ii(); u = a[0]; v = a[1];}
                T[u].add(v);
                T[v].add(u);
            }
        }

        int[] bfs(int s){
            int[] parent = new int[V+1];
            LinkedList<Integer> A = new LinkedList<>();
            HashSet<Integer> B = new HashSet<>();
            A.add(s);
            while(!A.isEmpty()){
                int v = A.pollFirst();
                for(int u : T[v]){
                    if(!B.contains(u)){
                        A.addLast(u);    
                        B.add(u);
                        parent[u] = v;
                    }
                }
            }
            return parent;
        }
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
