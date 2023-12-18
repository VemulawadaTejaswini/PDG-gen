import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    static class edge{
        int from, to, cost;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(str[0]);
        int e = Integer.parseInt(str[1]);
        int r = Integer.parseInt(str[2]);

        ArrayList[] es = new ArrayList[v];
        for(int i=0; i<v; i++) es[i] = (new ArrayList<edge>());

        for (int i=0; i<e; i++){
            str = br.readLine().split(" ");
            edge ed = new edge();
            ed.from = Integer.parseInt(str[0]);
            ed.to = Integer.parseInt(str[1]);
            ed.cost = Integer.parseInt(str[2]);
            es[ed.from].add(ed);
        }

        PriorityQueue<long[]> dist = new PriorityQueue<>((long[] le, long[] ri) -> (int)(le[0] - ri[0]));
        long[] vertex = new long[2];
        vertex[0] = 0;
        vertex[1] = r;
        dist.add(vertex);

        long[] len = new long[v];
        Arrays.fill(len, Long.MAX_VALUE);
        len[r] = 0;

        while(!dist.isEmpty()){
            vertex = (long[])dist.poll();

            long u = vertex[1];
            for (Object ed: es[(int)u]){
                if(len[((edge) ed).from] + ((edge) ed).cost < len[((edge) ed).to]) {
                    len[((edge) ed).to] = len[((edge) ed).from] + ((edge) ed).cost;
                    long[] p = new long[2];
                    p[0] = len[((edge) ed).to];
                    p[1] = ((edge) ed).to;
                    dist.add(p);
                }
            }
        }

        for(int i=0; i<v; i++){
            if(len[i] == Long.MAX_VALUE){
                System.out.println("INF");
            } else {
                System.out.println(len[i]);
            }
        }
    }
}