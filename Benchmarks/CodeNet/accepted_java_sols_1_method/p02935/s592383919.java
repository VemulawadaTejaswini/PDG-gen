import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strv = br.readLine().split(" ");
        double[] v = Stream.of(strv).mapToDouble(Double::parseDouble).toArray();

        PriorityQueue<Double> pq = new PriorityQueue<>();
        
        for(int i = 0; i < N; i++){
            pq.add(v[i]);
        }
        
        while( pq.size() > 1 ) {
            double a = pq.poll();
            double b = pq.poll();
            pq.add( (a + b) / 2 ) ;
        }

        System.out.println(pq.poll());
    }
}
