import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class P2{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] items = br.readLine().split(" ");
        int length = Integer.parseInt(items[0]);
        int qms = Integer.parseInt(items[1]);
        ArrayDeque<P> queue = new ArrayDeque<P>();
        for(int i = 0; i < length; i++){
            items = br.readLine().split(" ");
            P p = new P();
            p.name = items[0];
            p.time = Integer.parseInt(items[1]);
            queue.addLast(p);
        }

        StringBuilder sb = new StringBuilder();
        System.out.println();

        int sTime = 0;
        while (!queue.isEmpty()) {
        P p = new P();
          p = queue.pollFirst();
          if(p.time - qms <= 0){
              sTime += p.time;
              sb.append(p.name).append(" ").append(sTime).append("\n");
            }else if(p.time - qms > 0){
              p.time = p.time - qms;
              queue.addLast(p);
              sTime = sTime + qms;
            }
          }

        System.out.print(sb);
    }
}

class P{
    String name;
    int time;
}