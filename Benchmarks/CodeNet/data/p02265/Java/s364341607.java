import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
  
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
         
        Deque<Integer> list = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            String cmd = br.readLine();
            if(cmd.charAt(0) == 'i') {
                list.addFirst(Integer.parseInt(cmd.substring(7)));
            }else if(cmd.charAt(6) == ' ') {
                list.remove(Integer.parseInt(cmd.substring(7)));
            }else if(cmd.charAt(6) == 'F') {
                list.removeFirst();
            }else {
                list.removeLast();
            }
        }
 
        StringBuilder sb = new StringBuilder();
        sb.append(list.removeFirst());
        while(!list.isEmpty()) {
            sb.append(" ").append(list.removeFirst());
        }
        System.out.println(sb);
    }
}
