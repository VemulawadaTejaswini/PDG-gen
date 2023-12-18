import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Created by ??\??? on 2016/12/7.
 */

public class Main {
    static int si(String s){
        return Integer.parseInt(s);
    }
    static void run(String[] args) throws Exception{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = scan.readLine().split(" ");
        int T = si(lines[0]);
        int H = si(lines[1]);
        Map<String,Integer> m = new HashMap<>();
        Queue<String> q = new ArrayDeque<>();
        Queue<String> done = new ArrayDeque<>();
        for(int i = 0;i<T;i++){
            lines = scan.readLine().split(" ");
            m.put(lines[0],si(lines[1]));
            q.add(lines[0]);
        }
        int time =0;
        while(T>0){
            String w = q.poll();
            int ti = m.get(w)-H;
            if(ti>0) {
                q.add(w);
                m.replace(w,ti);
                time+=H;
            }
            else{
                time+=m.get(w);
                done.add(w+" "+String.valueOf(time));
                m.replace(w,0);
                T--;
            }
        }
        for(String s: done){
            System.out.println(s);
        }
    }
    public static void main(String[] args) throws Exception{
        run(args);
    }
}