import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

        edge[] es = new edge[e];
        for (int i=0; i<e; i++){
            str = br.readLine().split(" ");
            edge ed = new edge();
            ed.from = Integer.parseInt(str[0]);
            ed.to = Integer.parseInt(str[1]);
            ed.cost = Integer.parseInt(str[2]);
            
            es[i] = ed;
        }

        long[] distance = new long[v];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[r] = 0;
        for(int i=0; i<v; i++){
            for(int j=0; j<e; j++){
                edge ed = es[j];
                if(distance[ed.from] != Long.MAX_VALUE)
                    distance[ed.to] = Long.min(distance[ed.to], distance[ed.from] + ed.cost);
            }
        }
        for(int i=0; i<distance.length; i++) {
            if(distance[i] == Long.MAX_VALUE){
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }
}