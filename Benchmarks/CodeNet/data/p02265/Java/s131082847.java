import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;


public class Main {
    public static void main(String[] args) throws Exception {
        
        Deque<String> list = new ArrayDeque<String>();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        while((line = br.readLine()) != null){
            String[] order = line.split(" ");
            switch(order[0]){
                case "insert" : list.addFirst(order[1]);
                    break;
                case "delete" : list.remove(order[1]);
                    break;
                case "deleteFirst" : list.removeFirst();
                    break;
                case "deleteLast" : list.removeLast();
                    break;
                default:
            }
        }

        String s;
        if((s = list.pollLast()) != null){
            for(String n : list)
                System.out.printf("%s ", n);
            System.out.println(s);
        }
    }
}
