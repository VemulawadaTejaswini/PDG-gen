import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Deque<Integer> list = new ArrayDeque<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i){
            String line = br.readLine();
            char c = line.charAt(0);
            if(c == 'i')
                list.addFirst(Integer.valueOf(line.substring(7)));
            if(c == 'd'){
                int len = line.length();
                if(len == 11)
                    list.removeFirst();
                else if(len == 10)
                    list.removeLast();
                else
                    list.remove(Integer.valueOf(line.substring(7)));
            }
        }

        Integer m;
        if((m = list.pollLast()) != null){
            StringBuilder sb = new StringBuilder();
            for(int j : list)
                sb.append(j).append(" ");
            sb.append(m);
            System.out.println(sb);
        }
    }
}
