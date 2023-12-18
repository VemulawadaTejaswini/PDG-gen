import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        while((line = br.readLine()) != null){
            String[] order = line.split(" ");
            switch(order[0]){
                case "insert" : list.addFirst(Integer.valueOf(order[1]));
                    break;
                case "delete" : list.remove(Integer.valueOf(order[1]));
                    break;
                case "deleteFirst" : list.removeFirst();
                    break;
                case "deleteLast" : list.removeLast();
                    break;
                default:
            }
        }

        Integer m;
        if((m = list.pollLast()) != null){
            StringBuilder sb = new StringBuilder();
            for(int j : list)
                sb.append(j).append(" ");
            System.out.println(sb.append(m));
        }
    }
}
