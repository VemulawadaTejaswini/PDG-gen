import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayDeque;


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lines = getContents();
        int n = Integer.parseInt(lines.get(0).split(" ")[1]);
        
        Function<Stream<String>, Queue<QueueProcess>> makeQueue = stream -> {
            Queue<QueueProcess> queue = new ArrayDeque<QueueProcess>();
            stream.map(str -> str.split(" "))
                .forEach(s -> queue.add(new QueueProcess(s[0], Integer.parseInt(s[1]))));
            return queue;
        };

        Queue<QueueProcess> queue = makeQueue.apply(lines.stream().skip(1));
        int time = 0;
        while(!queue.isEmpty()){
            QueueProcess qp = queue.poll();
            int m = qp.time - n;
            if(m > 0){
                qp.time = m;
                queue.add(qp);
                time += n;
            }else{
                time += qp.time;
                System.out.printf("%s %d\n", qp.name(), time);
            }
        }
    }
    
    public static ArrayList<String> getContents() throws IOException{
        String line;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) != null) list.add(line);
         
        return list;
    }
}

class QueueProcess{
    private String _name;
    public String name(){ return _name; }
    public int time;
    public QueueProcess(String name, int time){
        this._name = name;
        this.time = time;
    }
}
