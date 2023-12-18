import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String n = scan.readLine();
        comp c = new comp();
        PriorityQueue<Integer> set = new PriorityQueue<>(2000000, c);
        while (!n.equals("end")){
            if(n.startsWith("insert")){
                int x = Integer.parseInt(n.substring(n.indexOf(" ") + 1));
                set.add(x);
            }
            else{
                System.out.println(set.poll());
            }
            n = scan.readLine();
        }
    }
    static class comp implements Comparator<Integer>{
        public int compare(Integer x, Integer y){
            if(x > y){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
}
